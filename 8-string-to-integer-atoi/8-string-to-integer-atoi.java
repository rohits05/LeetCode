class Solution {
    public int myAtoi(String s) {
        final int len = s.length();
        
        if(len == 0) return 0;
        
        int index = 0;
        while(index < len && s.charAt(index) == ' '){
            index++;
        }
        
        if(index == len) return 0;
        
        char ch;
        boolean isNegative = (ch = s.charAt(index)) ==  '-';
        
        if(isNegative || ch == '+') ++index;
            
        final int maxLimit = Integer.MAX_VALUE / 10;
        int result = 0;
        while(index < len && isDigit(ch = s.charAt(index))){
            
            int digit = ch - '0';
            
            if(result > maxLimit || (result == maxLimit && digit > 7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            result = (result * 10) + digit;
            
            ++index;
        }
        
        return isNegative ? -result : result;
    }
    
    private boolean isDigit(char ch){
        return ch >= '0' && ch <= '9';
    }
}
