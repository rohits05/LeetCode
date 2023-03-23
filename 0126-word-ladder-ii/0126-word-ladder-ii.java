class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<>(); 
        Map<String, Set<String>> reverse = new HashMap<>(); 
        Set<String> wordSet = new HashSet<>(wordList); 
        wordSet.remove(beginWord);
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord); 
        
        Set<String> nextLevel = new HashSet<>(); 
        boolean findEnd = false; 
        while(!queue.isEmpty()){
            String word = queue.remove();
            for(String next: wordSet){
                if(isLadder(word, next)){
                    Set<String> reverseLadders 
                    = reverse.computeIfAbsent(next, k -> new HashSet<>());
                    reverseLadders.add(word); 
                    if(endWord.equals(next)) findEnd = true;
                    nextLevel.add(next);
                }
            }
            if(queue.isEmpty()){
                if(findEnd) break;
                queue.addAll(nextLevel); 
                wordSet.removeAll(nextLevel); 
                nextLevel.clear();
            }
        }
        
        if(!findEnd) return ans;
        Set<String> path = new LinkedHashSet<>();
        path.add(endWord);
        
        findPath(endWord, beginWord, reverse, ans, path); 
        return ans;
    }


    private void findPath(String endWord, String beginWord, Map<String, Set<String>> graph,
                                 List<List<String>> ans, Set<String> path) {
        Set<String> next = graph.get(endWord);
        if(next == null) return;
        for(String word: next){
            path.add(word);
            if(beginWord.equals(word)){
                List<String> shortestPath = new ArrayList<>(path);
                Collections.reverse(shortestPath); 
                ans.add(shortestPath);
            }else findPath(word, beginWord, graph, ans, path);
            
            path.remove(word);
        }
    }

    private boolean isLadder(String s, String t){
        if(s.length() != t.length()) return false;
        int diffCount = 0, n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i) != t.charAt(i)) diffCount++;
            if(diffCount > 1) return false;
        }
        
        return diffCount == 1;
    }
}