class Solution {
    public String gcdOfStrings(String str1, String str2) {
        while(!str2.isEmpty()) {
            if(str1.equals(str2)) return str1;
        
            if(str1.length() < str2.length()){
                String tmp = str1;
                str1 = str2;
                str2 = tmp;                
            }
                         
            if(str1.substring(0, str2.length()).equals(str2)){
                String r = str1.substring(str2.length());
                str1 = str2;
                str2 = r;
            }else return "";
        }
        
        return str1;
    }
}