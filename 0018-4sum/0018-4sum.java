class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, target, 4, res, new ArrayList<>());
        return res;
    }
    
    private void helper(int[] nums, int start, long target, int k, List<List<Integer>> res, List<Integer> current) {
        int n =nums.length;
        
        if(k > 2){
            for(int i=start; i<n-k+1; i++){
                if(i > start && nums[i] == nums[i - 1]) continue;
                current.add(nums[i]);
                helper(nums, i+1, target - nums[i], k-1, res, current);
                current.remove(current.size() - 1);
            }
        }else{
            int left =start, right =n-1;
            while(left < right){
                if(nums[left] + nums[right] > target) right--;
                else if(nums[left] + nums[right] < target) left++;
                else{
                    current.add(nums[left]);
                    current.add(nums[right]);
                    res.add(new ArrayList<>(current));
                    current.remove(current.size() - 1);
                    current.remove(current.size() - 1);
                    left++;
                    while(left < right && nums[left] == nums[left-1]) left++;
                }
            }
        }
    }
}