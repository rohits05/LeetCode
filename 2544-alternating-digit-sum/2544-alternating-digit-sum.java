class Solution {
    public int alternateDigitSum(int n) {
        String str = Integer.toString(n);
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            if(i % 2 == 0) sum += (str.charAt(i) - '0');
            else sum -= (str.charAt(i) - '0');
        }
        
        return sum;
    }
}