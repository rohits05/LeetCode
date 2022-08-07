class Solution {
    public int reversePairs(int[] nums) {
        // forming entire mergeSort as answer ~ returning as total no.of pairs
        return mergeSort(nums, 0, nums.length-1);
    }
    
    int mergeSort(int[] nums, int low, int high){
        if(low >= high) return 0;
        
        int mid = (low + high)/2;
        int inv = mergeSort(nums, low, mid);
        // Adding inverse to every recursive call
        inv += mergeSort(nums, mid+1, high); 
        inv += merge(nums, low, mid, high);
        return inv; 
    }
    
    int merge(int[] nums, int low, int mid, int high){
        int cnt =0, j =mid + 1;
        
        for(int i=low; i<=mid; i++){ // Left half of array
            while(j<=high && nums[i] > (2*(long)nums[j])){ // exausted condition
                j++;
            }
            cnt += (j - (mid + 1)); // No.of left elements
        }
        
        ArrayList<Integer> temp = new ArrayList();
        
        int left = low, right = mid + 1;
        while(left <= mid && right <= high){
            // Condition goes for Smaller Case
            if(nums[left] <= nums[right]){
                temp.add(nums[left++]);
            }else{
                temp.add(nums[right++]);
            }
        }
        
        // If any one of L/R is Exausted
        while(left <= mid){
            temp.add(nums[left++]);
        }
        while(right <= high){
            temp.add(nums[right++]);
        }
              
        // Copyong back to the Original Array
        for(int i=low; i<=high; i++){
            nums[i] = temp.get(i - low);
        }
        // Merge Step Is Done!!
        return cnt; // Now, returning back the Total no.of pairs
    }
}