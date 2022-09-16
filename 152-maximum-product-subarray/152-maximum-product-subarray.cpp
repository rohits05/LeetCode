class Solution {
public:
    int maxProduct(vector<int>& nums) {
        // DP - Space OpTimization!!
        int maxP =nums[0], minP =nums[0], ans =nums[0];   
        
		for(int i=1; i<nums.size(); i++){
            int first = nums[i];
            int second = maxP*nums[i];   
            int third = minP*nums[i];    
            minP = min(min(first,second), third);
            maxP = max(max(first,second), third);
            ans = max(ans,maxP);   
        }
        return ans;
    }
};