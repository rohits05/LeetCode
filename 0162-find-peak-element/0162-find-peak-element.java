class Solution {
    public int findPeakElement(int[] nums) {
        int s =0, e = nums.length - 1, mid = s + (e - s)/2;;
        
        while(s < e){
            if(nums[mid] < nums[mid+1]) s = mid + 1;
            else e = mid;
            mid = s + (e - s)/2;
        }
        return mid;
    }
}