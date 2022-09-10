class Solution {
public:
    void sortColors(vector<int>& nums) {
        // sort(nums.begin(), nums.end());
        
        int temp =0, start =0, mid =0, end =nums.size() - 1;
    
        while(mid <= end) {
            if(nums[mid] == 0) {
                temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else if(nums[mid] == 2) {
                temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            }
        }
     }
};