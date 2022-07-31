class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans =0, sum =0, rem =0;
        map.put(0, 1); // Initial sum 0,with freq. 1
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            rem = sum%k;
            
            if(rem <0) rem += k; // -ve rem case
            
            // checking for appeared rem case
            if(map.containsKey(rem)){
                ans += map.get(rem);
                map.put(rem, map.get(rem)+1);
            } else {
                map.put(rem, 1);
            }
        }
        return ans;
    }
}