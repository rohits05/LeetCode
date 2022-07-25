class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findPosition(nums, target, false);
        int end = findPosition(nums, target, true);

        return new int[]{start, end};
   }

    public int findPosition(int[] A, int target, boolean isLast) {
        int start = 0; 
        int end = A.length-1;
        int index = -1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(isLast){
                if (A[mid] <= target) 
                    start = mid + 1;
                else 
                    end = mid - 1;
            }
            else{
                if (A[mid] < target) 
                    start = mid + 1;
                else 
                    end = mid-1;
            }
            if(A[mid] == target) 
                index = mid;
        }

        return index;
    }
}