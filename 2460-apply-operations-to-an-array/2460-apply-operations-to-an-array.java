class Solution {
    public int[] applyOperations(int[] nums) {
         for(int i=0; i<nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                  nums[i] *= 2;
                  nums[i + 1] = 0;
            }
         }
         move(nums);
         return nums;
    }
    
    public void move(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=0){
				int temp=arr[count];
				arr[count] = arr[i];
				arr[i]= temp;
				count++;
			}
		}
    }
}