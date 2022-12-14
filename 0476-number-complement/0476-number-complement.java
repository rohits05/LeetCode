class Solution {
    public int findComplement(int num) {
        // return num ^ ((Integer.highestOneBit(num) << 1) - 1);
        
        // BiT MaskinG !1
        int binaryLen = (int) (Math.log(num) / Math.log(2)) + 1;
        String s = "";
        while(binaryLen > 0){
          s += '1';
          binaryLen--;
        }
        return Integer.parseInt(s, 2) ^ num;
    }
}