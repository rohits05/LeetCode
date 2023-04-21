class Solution {
    public String freqAlphabets(String s) {
        StringBuilder s1 = new StringBuilder();
        
        int i =0;
        while(i < s.length()){
            if(i + 2 < s.length() && s.charAt(i + 2) == 35){
                s1.append((char)(96 + Integer.parseInt(s.substring(i, i + 2))));
                i += 3;
            }else{
                s1.append((char)(96 + Integer.parseInt(s.substring(i, i + 1))));
                i++;
            }
        }
    
        return s1.toString();
    }
}