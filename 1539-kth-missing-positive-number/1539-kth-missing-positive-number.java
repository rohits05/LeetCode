class Solution {
    public int findKthPositive(int[] arr, int k) {
//         int left =0, right =arr.length-1; O(logN)
        
//         while(left <= right){
//             int mid = left + (right-left)/2;
            
//             if(arr[mid]-mid <= k) left = mid+1;
//             else right = mid-1;
//         }
        // return left+k;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= k) k++;
            else break;
        }
        return k;
    }
}