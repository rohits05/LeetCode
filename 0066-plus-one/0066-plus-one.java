class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length; 
        for(int i = len-1; i>=0; i--){
            if(digits[i] == 9) digits[i] = 0;
            else{ digits[i] += 1; return digits; }     
        }
        
        int[] arr = new int[len+1];
        arr[0] = 1;
        return arr;
    }
}