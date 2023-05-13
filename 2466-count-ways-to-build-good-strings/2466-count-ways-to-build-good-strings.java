class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int [][] dp = new int[2][high+1];
        int sum =0, mod =1000000007;
        
        for(int i=0; i<=high; i++){
            if(zero > i) dp[0][i] = 0;
            if(one > i) dp[1][i] = 0;

            if(zero <= i){
                if(zero==i) dp[0][i] =1;
                else  dp[0][i] = (dp[0][i-zero] + dp[1][i-zero])%mod;
            }

            if(one <= i){
                if(one == i) dp[1][i] =1;
                else  dp[1][i] = (dp[0][i-one] + dp[1][i-one])%mod;
            }

            if(i >= low) sum = (((dp[0][i]%mod) + (dp[1][i]%mod)) % mod+sum) %mod;
        }
        
        return sum;
    }
}