class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        
        int maker = 0;
        
        for(int i=0; i<n; i++){
            if( maker < i) return false;
            maker = max(maker, i+nums[i]);
        }
        return true;
    }
};