class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        int i = 0;
        for(char ch: order.toCharArray()) map.put(ch,i++);
        
        for(int k=0; k<words.length; k++){
            char[] ss = words[k].toCharArray();
            for(int j=0; j<ss.length; j++) ss[j] = (char)(map.get(ss[j])+97);
            words[k] = new String(ss);
        }
        
        String[] beforeSort = words.clone();
        Arrays.sort(words);
        return Arrays.toString(beforeSort).equals(Arrays.toString(words));
    }
}