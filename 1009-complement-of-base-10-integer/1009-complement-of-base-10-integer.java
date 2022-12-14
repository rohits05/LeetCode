class Solution {
    public int bitwiseComplement(int n) {
        int dum = 1;
        while(n > dum) dum = 2 * dum + 1;
        return n ^ dum;
    }
}