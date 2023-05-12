class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length + 1];
        Arrays.fill(dp, -1);

        return findCount(0, questions, questions.length, dp);
    }

    public static long findCount(int i, int[][] questions, int n, long[] dp){
        if(i >= n) return 0;
        if(dp[i] != -1) return dp[i];

        return dp[i] = Math.max(findCount(i + 1, questions, n, dp), 
                       questions[i][0] + findCount(i + 1 + questions[i][1], 
                       questions, n, dp));  
    }
}