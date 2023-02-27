class Solution {
    int[] dummy = new int[1 << 9 + 1];
    public int longestAwesome(String s) {
        int n = s.length();
        Arrays.fill(dummy, n);
        
        dummy[0] = -1;
        int resulT = 0, mask = 0;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            mask ^= 1 << (c - '0');
            resulT = Math.max(resulT, i - dummy[mask]);
            
            for(int j=0; j<10; j++)
                resulT = Math.max(resulT, i - dummy[mask ^ (1 << j)]);
            if(dummy[mask] == n) dummy[mask] = i;
        }
        
        return resulT;
    }
}