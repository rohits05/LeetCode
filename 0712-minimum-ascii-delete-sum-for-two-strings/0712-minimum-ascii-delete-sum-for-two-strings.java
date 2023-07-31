class Solution {
    private int[][] memo;
    private String s1, s2;
    
    public int minimumDeleteSum(String s1, String s2) {
        this.memo = new int[s1.length()][s2.length()];
        this.s1 = s1;   
        this.s2 = s2;
        for(var m: memo) Arrays.fill(m, -1);
        return recur(0, 0);
    }
    
    private int recur(int i, int j) {
        if(i == s1.length()){
            int ans = 0;
            while (j != s2.length()) ans += s2.charAt(j++);
            return ans;
        }
        
        if(j == s2.length()){
            int ans = 0;
            while (i != s1.length()) ans += s1.charAt(i++);
            return ans;
        }
        
        if(memo[i][j] != -1) return memo[i][j];
        int ans = (s1.charAt(i) == s2.charAt(j)) ? recur(i+1, j+1)
                : Math.min(recur(i+1, j) + s1.charAt(i),
                  recur(i, j+1) + s2.charAt(j));
        memo[i][j] = ans;
        
        return ans;
    }
}