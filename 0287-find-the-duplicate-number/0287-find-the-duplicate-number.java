class Solution {
    public int findDuplicate(int[] nums) {
        int len =nums.length;
//         int[] cnt = new int[len + 1];
        
//         for(int i=0; i<len; i++){
//             cnt[nums[i]]++;
//             if(cnt[nums[i]] > 1) return nums[i];
//         }
        
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<len; i++)
            if(!set.add(nums[i])) return nums[i];
        return len;
    }
}