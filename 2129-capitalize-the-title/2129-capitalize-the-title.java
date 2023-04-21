class Solution {
    public String capitalizeTitle(String title) {
        char c[] = title.toCharArray();
        int n = c.length;
        
        for(int i=0; i<n; i++){
            int fI = i;
            
            while(i<n && c[i] != ' '){
                c[i] = Character.toLowerCase(c[i]);
                i++;
            }
            
            if(i-fI > 2) c[fI] = Character.toUpperCase(c[fI]);
        }
        
        return String.valueOf(c);
    }
}