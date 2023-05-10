class Solution {
    public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        
        int rB =0, cB =0, cnt =1;
        int rE =n-1, cE =n-1;
        
        while(rB <= rE && cB <= cE){
            for(int i=cB; i<=cE; i++){
                res[rB][i] = cnt++;
            } rB++;
            
            for(int i=rB; i<=rE; i++){
                res[i][cE] = cnt++;
            } cE--;
            
            if(rB <= rE){
                for(int i=cE; i>=cB; i--){
                    res[rE][i] = cnt++;
                }
            } rE--;
            
            if(cB <= cE){
                for(int i=rE; i>=rB; i--){
                    res[i][cB] = cnt++;
                }
            } cB++;
        }
        
        return res;
    }
}