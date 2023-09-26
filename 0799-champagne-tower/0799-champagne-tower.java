class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] curLvl = new double[query_row+2];
        curLvl[0] = poured;
        
        for(int row=1; row<=query_row; row++){
            for(int i=row; i>=0; i--) curLvl[i+1] += curLvl[i] = Math.max(0.0, (curLvl[i]-1) / 2);
        }
        
        return Math.min(curLvl[query_glass], 1.0);
    }
}