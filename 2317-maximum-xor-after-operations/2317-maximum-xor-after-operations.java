class Solution {
    public int maximumXOR(int[] nums) {
        int res =0;
        for(int items: nums) res = res | items;
        return res;
    }
}