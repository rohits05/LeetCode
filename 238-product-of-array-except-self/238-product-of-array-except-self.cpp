class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n =nums.size(), rCnt =1;
        
        vector<int> op(n);
        op[0] = 1;
        
        for(int i=1; i<n; i++) op[i] = op[i-1] * nums[i-1];
        
        for(int i=n-1; i>=0; i--){ op[i] = op[i] * rCnt; rCnt = rCnt * nums[i]; }
        
        return op;
    }
};