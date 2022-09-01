class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // Space Omtimization!
        int n = nums.size();
        int prev = nums[0];
        int curr = nums[0];
        for(int i=1; i<n; i++){
            prev = max(nums[i], prev + nums[i]);
            curr = max(curr, prev);
        }
        return curr;
    }
};