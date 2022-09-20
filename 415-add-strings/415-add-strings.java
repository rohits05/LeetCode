class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        
        int m = num1.length() - 1, n = num2.length() - 1;
        int carry = 0;
        
        while(m >= 0 || n >= 0){
            int sum = carry;
            
            if(m >= 0) sum += num1.charAt(m--) - '0';
            if(n >= 0) sum += num2.charAt(n--) - '0';
            
            res.append(sum % 10);
            carry = sum / 10;
        }
        
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}