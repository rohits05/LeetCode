class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0, words = 0, n = text.length();
        if(Character.isSpace(text.charAt(0))) spaces++;
        else words++;
        
        for(int i=1; i<n; i++){
            if(Character.isSpace(text.charAt(i))) spaces++;
            if(Character.isLetter(text.charAt(i)) 
               && Character.isSpace(text.charAt(i-1))) words++;
        }

        int eqDistribution,spacesAtEnd, places = words-1;
        if(places == 0){
            eqDistribution = 0;
            spacesAtEnd = spaces;
        }
        else{
            eqDistribution = spaces/places;
            spacesAtEnd = spaces % places;
        }
        
        text = text.trim();
        String[] wordsArr = text.split(" +");
        int len = wordsArr.length;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<len; i++){
            sb.append(wordsArr[i]);
            if(i == len-1 && spacesAtEnd > 0){
                int k = spacesAtEnd;
                while(k>0){
                    sb.append(" ");
                    k--;
                }
            }else if(i != len-1 && eqDistribution > 0){
                int j = eqDistribution;
                while(j>0){
                    sb.append(" ");
                    j--;
                }
            }
        }

        return sb.toString();
    }
}