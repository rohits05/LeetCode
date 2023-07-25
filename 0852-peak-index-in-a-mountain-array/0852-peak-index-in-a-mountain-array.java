class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        int mid;
        
        while(start < end){
            mid = start + (end - start)/2;
            
            if(arr[mid] < arr[mid + 1]) start = mid + 1;
            else end = mid;
        }
        
        return start; 
    }
}