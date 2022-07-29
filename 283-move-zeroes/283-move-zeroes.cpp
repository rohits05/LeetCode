class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i = 0; // NonZero El
        
        for(int j=0; j<nums.size(); j++) {
            if(nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }   
        } 
    }
};