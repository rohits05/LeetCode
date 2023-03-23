class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//         if(wordList == null || wordList.size() == 0) return 0;

//         Set<String> dict = new HashSet<>(wordList);
//         if(!dict.contains(endWord)) return 0;

//         Set<String> startSet = new HashSet<>();
//         startSet.add(beginWord);
//         Set<String> endSet = new HashSet<>();
//         endSet.add(endWord);

//         return bfs(startSet, endSet, dict, 1);
        
        // OpTimized!!
        Set<String> set = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        
        int step = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int j=0; j<size; j++){
                String cur = q.poll();
                for(int i=0; i<endWord.length(); i++){
                    for(char letter='a'; letter<='z'; letter++){ 
                        StringBuilder newWord = new StringBuilder(cur);
                        newWord.setCharAt(i, letter);
                        if(set.contains(newWord.toString())){
                            if(newWord.toString().equals(endWord)) return step + 1;
                            set.remove(newWord.toString());
                            q.offer(newWord.toString());
                        }
                    }
                }

            }
            step++;
        }
    
        return 0;
    }

    private int bfs(Set<String> startSet, Set<String> endSet, Set<String> dict, int level) {
        if(startSet.size() == 0) return 0; 
		dict.removeAll(startSet); 
        dict.removeAll(endSet);

        Set<String> nextSet = new HashSet<>();
        for(String str: startSet){
            char[] chs = str.toCharArray();
            for(int i=0; i<chs.length; i++){
                char c = chs[i];
                for(char j='a'; j<='z'; j++){
                    chs[i] = j;
                    String word = new String(chs);
                    if(!dict.contains(word) && endSet.contains(word))  return level + 1;
                    if(dict.contains(word)) nextSet.add(word);
                }
                
                chs[i] = c;
            }
        }

        return nextSet.size() != 0 && nextSet.size() > endSet.size() ? 
                bfs(endSet, nextSet, dict, level + 1) : 
                bfs(nextSet, endSet, dict, level + 1);
    }
}