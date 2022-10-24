class Solution {
     public int maxLength(List<String> arr) {
        if(arr == null || arr.size() == 0) return 0;
        int[] max = new int[1];
        dfs("", 0, arr, max);
        return max[0];
    }
    
    boolean isUniqueChars(String s){
        boolean[] set = new boolean[26];
        for(char c : s.toCharArray()) {
            if(set[c-'a']) return false;
            set[c-'a'] = true; 
        }
        return true;
    }

    void dfs(String path, int index, List<String> arr, int[] max) {
        if(!isUniqueChars(path)) return;
        
        max[0] = Math.max(max[0], path.length());
        if(index == arr.size()) return;
        
        for(int i=index; i<arr.size(); i++) {
            if(!isUniqueChars(arr.get(i))) continue;
            dfs(path + arr.get(i), i+1, arr, max);
        }
    }
}