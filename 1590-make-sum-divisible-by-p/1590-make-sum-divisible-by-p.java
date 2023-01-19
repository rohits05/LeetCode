class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for(int i=0; i<nums.length; i++) sum += nums[i];
        if(sum%p == 0) return 0;
		
		int requiredRem = (int)(sum%p);
        HashMap<Integer, Integer> rem = new HashMap<>();
        rem.put(0, -1);
        sum = 0;
        
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int curRem = (int)(sum%p);
            int searchFor = curRem - requiredRem;
            if(searchFor < 0) searchFor += p;
            if(rem.containsKey(searchFor)) res = Math.min(res, i-rem.get(searchFor));
            rem.put(curRem, i);
        }
        return (res == nums.length ? -1 : res);
        
//         int n = nums.length;
//         int arr[] = new int[p];
//         Arrays.fill(arr,-1);
        
//         return helper(nums,n,p,0,arr);
    }
    
//     public int helper(int nums[],int n,int m,int sum,int arr[]){
//         if((sum%m) == 0 && sum != 0) return 1;
//         else if(n == 0) return 0;
//         else if(arr[(sum%m)] != -1) return arr[(sum%m)];
        
//         else return arr[(sum%m)] = (helper(nums, n-1, m, sum+nums[n-1], arr)
//                                             | helper(nums, n-1, m, sum, arr));
//     }
}