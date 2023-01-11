class Solution {
    public int minIncrementForUnique(int[] nums) {
        // O(NlogN) - O(1)
        int res =0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                res += nums[i-1]+1 - nums[i];
                nums[i] = nums[i-1]+1;
            }
        }
        return res;
        
        // O(N) - O(N)
//         int[] arr = new int[100000];
//         int baggage = 0, increments = 0;
//         for(int el: nums){ arr[el]++; }

//         for(int i=0; i<100000; i++){
//             if(arr[i] == 1) continue;
            
//             if(arr[i] > 1){
//                 baggage += arr[i] - 1;
//                 increments -= i * (arr[i] - 1);
//             }
//             else if(baggage > 0 && arr[i] == 0){
//                 baggage--;
//                 increments += i;
//             }
//         }
//         return increments;
    }
}