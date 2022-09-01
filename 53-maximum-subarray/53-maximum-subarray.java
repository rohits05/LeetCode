class Solution {
    public int maxSubArray(int[] nums) {
//         int sum = 0;
//         int maxi = nums[0];   
//         for(int i=0 ; i<nums.length ; i++){       
//             sum += nums[i];        
//             if( sum > maxi)
//                 maxi = sum;
            
//             if( sum < 0)
//                 sum = 0;
//         }  
//         return maxi;
        
        // Using, DP!!
        int n = nums.length;
        int dp[] = new int[n];
        int maxI = nums[0];
        dp[0] = nums[0];
        
        for(int i=1; i<n; i++){
            dp[i] = Math.max(nums[i], nums[i]+dp[i-1]);
            maxI = Math.max(maxI, dp[i]);
        }
        return maxI;
    }
}