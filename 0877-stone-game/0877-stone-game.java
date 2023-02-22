class Solution {
    public boolean stoneGame(int[] piles) {
        int sum =0;
        for(int i=0; i<piles.length; i++) sum += piles[i];
        
        if(sum%2 != 0) return true;
        return false;
    }
}