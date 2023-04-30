class Solution {
    public int findNumberOfLIS(int[] arr) {
        int N =arr.length;
        int[] dp = new int[N];
        int[] count = new int[N];

        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){

                if(arr[i] > arr[j] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    count[i] = count[j];
                }

                else if(arr[i] > arr[j] && dp[i] == dp[j] + 1){
                    count[i]+=count[j];
                }
            }

            maxi = Math.max(maxi, dp[i]);
        }

        int ans =0;
        for(int i=0; i<N; i++) if(dp[i] == maxi) ans += count[i];

        return ans;
    }
}