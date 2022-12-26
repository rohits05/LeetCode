class Solution {
    public boolean check(int[] nums) {
//         int check = 0;
//         for(int i=1; i<nums.length; i++){
//             if(nums[i-1] > nums[i]) check++;
//         }
        
//         if(nums[nums.length-1] > nums[0]) check++;
//         return (check <= 1);
        int cnt = 0, n = nums.length;
        for(int i=1; i<n; i++) if(nums[i-1] > nums[i]) cnt++;
        if(nums[n-1] > nums[0]) cnt++;
        if(cnt > 1) return false;
        return true;
    }
}