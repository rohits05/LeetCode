class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int arraySum =0;
        
        int temp1 =0, temp2 =0;
        
        for(int i=0; i<n; i++){
            arraySum += nums[i];
            
            temp1 += nums[i];
            maxSum = maxSum < temp1 ? temp1 : maxSum;
            temp1 = temp1< 0 ? 0: temp1;
            
            temp2 += nums[i];
            minSum = minSum> temp2 ? temp2 : minSum;
            temp2 = temp2> 0 ? 0: temp2;
        }
        
        if(arraySum == minSum) return maxSum;
        return Math.max(maxSum,  (arraySum - minSum));
    }
}