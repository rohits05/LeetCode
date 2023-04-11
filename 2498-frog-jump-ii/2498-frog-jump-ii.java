class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length, s = stones[1] - stones[0];
        for(int i=2; i<n; i++) s = Math.max(s, stones[i] - stones[i-2]);
        
        return s;
    }
}