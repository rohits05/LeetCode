class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int s =0, e =nums.size()-1;
        int res = 0;
        Collections.sort(nums);
        
        while(s<e){
            if(nums.get(s) + nums.get(e) < target){
                res += e-s;
                s++;
            }else e--;
        }
        
        return res;
    }
}