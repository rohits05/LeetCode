class Solution {
    public int minFlips(int a, int b, int c) {
        int ans = 0;
        
        while(a != 0 || b != 0 || c != 0){
            int x1 = a & 1, x2 = b & 1, x3 = c & 1;
            if((x1 | x2) != x3){
                if((x1 & x2) == 1) ans += 2;
                else ans += 1;
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        
        return ans;
    }
}