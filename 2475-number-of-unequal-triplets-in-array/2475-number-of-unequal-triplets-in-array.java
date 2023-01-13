class Solution {
    public int unequalTriplets(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        
        int res =0,left =0,right =nums.length;
        for(Map.Entry<Integer,Integer> entr: map.entrySet()){
             right -= entr.getValue();
             res += right*entr.getValue() * left;
             left += entr.getValue();
        }
        return res;
    }
}