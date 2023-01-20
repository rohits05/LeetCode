class Solution {
    static void find(int nums[],int start,int prev ,List<Integer> list,HashSet<List<Integer>> res){
        if(list.size() == nums.length && list.size() >= 2){
            res.add(new ArrayList<>(list));
            return;
        }
        else if(list.size() >= 2) res.add(new ArrayList<>(list));
        
        for(int i=start; i<nums.length; i++){
            if(nums[i] >= prev){
                list.add(nums[i]);
                find(nums, i+1, nums[i], list, res);
                list.remove(list.size()-1);
            }
        }
    }
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> res = new HashSet();
        find(nums, 0, Integer.MIN_VALUE, new ArrayList<Integer>(), res);
        
        return new ArrayList<>(res);
    }
}