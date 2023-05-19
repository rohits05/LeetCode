class Solution {
    public void rotate(int[] nums, int k) {
        // Approach 1
//      int temp[] = nums.clone();
//      k = k % nums.length;   
//      for(int i=0; i<nums.length; i++){
//          nums[(i+k) % nums.length] = temp[i];
//      }
            
        // OpTimizeD Approach
        int n =nums.length;
        k = k % n; // bound
        reverse(nums, 0, n-1); 
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1); 
    }
    
     public void reverse(int[] nums, int start, int end){
        while(start < end){  
            int temp = nums[start]; 
            nums[start] = nums[end]; 
            nums[end] = temp; 
            start++; end--; 
        }
    }
}