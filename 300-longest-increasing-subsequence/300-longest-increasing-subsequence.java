class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] sequence = new int[n];
        
        sequence[0] = nums[0];
        int sequenceIndex = 1;
        
        for(int i=0; i<n; i++){ 
            int currentVal = nums[i]; 
            if(currentVal > sequence[sequenceIndex - 1]){
                sequence[sequenceIndex] = currentVal;
                sequenceIndex++;      
            }else{          
                int indexToReplace = binarySearch(sequence, 0, sequenceIndex - 1, currentVal); 
                sequence[indexToReplace] = currentVal;
            }        
        }
        
        System.out.println("final");
        print(sequence);
        return sequenceIndex;     
    }
    
    private void print(int[] arr){
        for(int i : arr) System.out.print(i + ",");      
        System.out.println();
    }
    
    private int binarySearch(int[] arr, int left, int right, int target){   
        while(left <= right){ 
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}