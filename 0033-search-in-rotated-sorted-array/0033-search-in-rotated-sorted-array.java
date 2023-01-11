class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            // The pivot divides the array into 2 halves.
            if(target <= nums[end] && nums[mid] > nums[end]){
                // If target is at the right half and the mid number is at left half,
                //   ignore the numbers before mid.
                start = mid + 1;
            } else if(target > nums[end] && nums[mid] < nums[end]){
                // If target is at the left half and the mid number is at right half,
                //   ignore the numbers after mid.
                end = mid - 1;
            } else{
                // If both target and the mid number are present in the same half,
                //   do a normal binary search.
                if(nums[mid] == target){
                    return mid;
                }else if (target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            } 
        }
        return -1;      
    }
}