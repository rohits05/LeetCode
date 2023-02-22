class ThroneInheritance {
    String king;
    HashMap<String, LinkedHashSet<String>> graph;
    HashSet<String> isDead;
    
    public ThroneInheritance(String kingName) {
        king = kingName;
        graph = new HashMap<>();    
        isDead = new HashSet<>();
        
        graph.put(kingName, new LinkedHashSet<>());
    }
    
    public void birth(String parentName, String childName) {
        graph.putIfAbsent(parentName, new LinkedHashSet<>()); 
        graph.get(parentName).add(childName);
    }
    
    public void death(String name) {
        isDead.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> inheritance = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();
        dfs(graph, king, inheritance, visited);
        
        return inheritance;
    }
    
    public void dfs(HashMap<String, LinkedHashSet<String>> graph, String src, List<String> l, HashSet<String> visited){
        visited.add(src);
        
        if(!isDead.contains(src)) l.add(src);
        if(!graph.containsKey(src)) return;
        
        for(String s: graph.get(src))
            if(!visited.contains(s)) dfs(graph, s, l, visited);
     }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */