class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();
        func(0, arr, new ArrayList<>(), ans);
        return ans;
    }

    static void func(int ind, int nums[], List<Integer> d, List<List<Integer>> ans){
         ans.add(new ArrayList<>(d)); 
        
         for(int i=ind; i<nums.length; i++){
             if(i != ind && nums[i] == nums[i-1]) continue;
             d.add(nums[i]);
             func(i+1, nums, d, ans);
             d.remove(d.size() - 1);
         }
     }
}