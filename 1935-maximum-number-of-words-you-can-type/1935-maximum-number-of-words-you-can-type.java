class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count  = 0;
        String[] splt = text.split(" ");
        Map<Character,Integer> map = new HashMap<>();
        for(Character c: brokenLetters.toCharArray()) map.put(c, 1);

        for(String s: splt){
            boolean flag = true;
            for(int i=0; i<s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        
        return count;
    }  
}