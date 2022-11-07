class Solution {
    public int maximum69Number (int num) {
        int n = num, index = -1, i = 0;
        while(n > 0){
            if(n % 10 == 6) index = i;
            n /= 10;
            i++;
        }
        return (index == -1) ? num : (num + 3 * (int)Math.pow(10, index));
    }
}