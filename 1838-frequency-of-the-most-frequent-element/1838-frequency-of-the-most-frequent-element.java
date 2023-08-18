class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = 0, ans = 0;
        long total = nums[left];
        
        while(right < n){
            int winLen = right-left+1;
            if((nums[right] * winLen) <= total + k){
                ans = Math.max(ans, winLen);
                right++;
                if(right == n) break;
                total += nums[right];   
            }else{
                total -= nums[left];
                left++;
            }
        }
        
        return ans;
    }
}