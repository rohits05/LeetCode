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
    }
}