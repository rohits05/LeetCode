class Solution {
    public boolean hasAlternatingBits(int n) {
        // int tmp = 0, res = -1;
        // while(n != 0) {
        //     tmp = n & 1;
        //     if(tmp == res) return false;
        //     n >>>= 1;
        //     res = tmp;
        // }
        // return true;
        
        // ^ TechniQ
        n = (n^(n >> 1));
        return (n&(n + 1)) == 0;
    }
}