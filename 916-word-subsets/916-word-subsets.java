class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] count = new int[26];
        for (String b : B) { 
            int[] bCnt = new int[26];
            for (char c : b.toCharArray()) { // count b's char.  
                ++bCnt[c - 'a']; 
            }
            for (int i = 0; i < 26; ++i) { // count the max frequency. 
                count[i] = Math.max(count[i], bCnt[i]); 
            }
        } 
        List<String> ans = new ArrayList<>();
        outer: for (String a : A) {
            int[] aCnt = new int[26]; 
            for (char c : a.toCharArray()) { // count a's char. 
                ++aCnt[c - 'a']; 
            }
            // if the occurrency of char ('a' + i) in B is more frequent than 
            // that in a, ignore it.
            for (int i = 0; i < 26; ++i) { 
                if (count[i] > aCnt[i]) 
                    continue outer; 
            }    
            ans.add(a);
        }
        return ans;
    }
}