class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];

        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]){
                    if(dp1[i] < dp1[j]+1) dp1[i] = dp1[j]+1;
                }
            }
        }

        for(int i=nums.length-2; i>=0; i--){
            for(int j=nums.length-1; j>i; j--){
                if(nums[i] > nums[j]){
                    if(dp2[i]<dp2[j]+1)
                        dp2[i] = dp2[j]+1;
                }
            }
        }

        int maxi = dp1[0];
        for(int i=1; i<dp1.length; i++){
            maxi = Math.max(maxi, dp1[i]);
            dp1[i] = maxi;
        }
        
        maxi = dp2[dp2.length-1];
        for(int i=dp2.length-2; i>=0; i--){
            maxi = Math.max(dp2[i], maxi);
            dp2[i] = maxi;
        }
        
        maxi = 0;
        for(int i=1; i<nums.length-1; i++){
            if(dp1[i] != 1 && dp2[i] != 1)
            maxi = Math.max(maxi, dp1[i] + dp2[i]);
        }
        return (nums.length - maxi + 1);
    }
}