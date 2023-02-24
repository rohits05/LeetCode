class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(List<String> route : paths) set.add(route.get(1));
        for(List<String> route: paths) set.remove(route.get(0));
            
        return set.iterator().next();
    }
}