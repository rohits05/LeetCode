class Solution {
public:
    bool canJump(vector<int>& nums) {
        int LastGoodIdxPosiT = nums.size()-1;
        
        for(int i=nums.size()-1; i>=0; i--){
            if(i+nums[i] >= LastGoodIdxPosiT)
                LastGoodIdxPosiT = i;
        }
        return (LastGoodIdxPosiT == 0);
    }
};