class Solution {
    public int deleteAndEarn(int[] nums) {
        int include = 0, exclude =0;
        
        int arr[] = new int[10001]; // 10^4 Indexing ..
        
        for(int val: nums)
            arr[val]++;
        
        for(int i=0; i<= 10000; i++){
            int newInclude = exclude + arr[i] * i;
            int newExclude = Math.max(include, exclude);
            
            include = newInclude;
            exclude = newExclude;
        }
        return Math.max(include, exclude);
    }
}