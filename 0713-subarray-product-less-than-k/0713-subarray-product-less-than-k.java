class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        
        int prod =1, res =0, l =0, r =0;
        while(r < nums.length){
            prod *= nums[r];
            
            while(prod >= k){
                prod /= nums[l];
                l++;
            }
            res += r-l + 1;
            r++;
        }
        return res;
    }
}