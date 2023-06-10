class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n =nums.length, a =n/3;
        List<Integer> res = new  LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            int temp = nums[i];
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        
        for(int i: map.keySet()) if(map.get(i) > a) res.add(i);
        return res;
    }
}