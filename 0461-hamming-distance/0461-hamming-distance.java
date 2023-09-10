class Solution {
    public int hammingDistance(int x, int y) {
        int tmp =x^y, res =0;
        
        for(int i=0; i<32; i++){
            int bit = (tmp >> i) & 1;
            if(bit == 1) res++;
        }
        
        return res;
    }
}