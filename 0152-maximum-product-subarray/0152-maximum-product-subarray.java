class Solution {
    public int maxProduct(int[] nums) {
        int maxP =nums[0], minP =nums[0], ans =nums[0], n =nums.length;   
        
		for(int i=1; i<n; i++){
            int first = nums[i];
            int second = maxP*nums[i];   
            int third = minP*nums[i];    
            
            minP = Math.min(Math.min(first,second), third);
            maxP = Math.max(Math.max(first,second), third);
            ans = Math.max(ans, maxP);   
        }
        
        return ans;
    }
}