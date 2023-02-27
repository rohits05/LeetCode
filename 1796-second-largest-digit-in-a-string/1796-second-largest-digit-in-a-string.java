class Solution {
    public int secondHighest(String s) {
        char max1 = '0' - 10, max2 = max1;
        
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                if(c > max1){ max2 = max1; max1 = c; }
                else if(c != max1 && c > max2) max2 = c;
            }
        }
        return (max2 >= '0') ? max2 - '0' : -1;
    }
}