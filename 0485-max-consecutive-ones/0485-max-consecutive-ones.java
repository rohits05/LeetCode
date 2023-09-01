class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt =0, maxI =0, n =nums.length;
        
        for(int i=0; i<n; i++){
            if(nums[i] == 1) cnt++;
            else cnt = 0; 
            maxI = Math.max(maxI, cnt);
        }
        return maxI;
    }
}