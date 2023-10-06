class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs =0;
        int[] res = new int[101];
		for(int el: nums) res[el]++;
        
		for(int cnt : res) if(cnt > 1) pairs += cnt*(cnt-1)/2;
		return pairs;
    }
}