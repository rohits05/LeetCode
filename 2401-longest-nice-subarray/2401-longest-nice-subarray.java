class Solution {
    public int longestNiceSubarray(int[] nums) {
        int i =0, j =0, maxLength =1, currentLength =0;
        long currentSum =0;
        
        while(j < nums.length){ 
            long res = nums[j] & currentSum;
            if(res == 0){
                currentLength++; currentSum += nums[j];
                j++; continue;
            }
            
            maxLength = Math.max(maxLength, currentLength);
            int k = j - 1;
            currentSum = nums[j]; currentLength = 1;
            
            while(k >= 0 && (nums[j] & nums[k]) == 0){
                currentSum += nums[k]; currentLength++;
                k--;
            }
            j++;
        }
        
        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }
}