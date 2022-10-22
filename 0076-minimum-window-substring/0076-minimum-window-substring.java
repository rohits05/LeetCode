class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length())
            return "";
        int minLeft = 0, minRight = 0;
        int min = s.length();
        boolean flag = false;
        
        Map<Character, Integer> map = new HashMap<>();
        int count = t.length(); 
        for(char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
            int i = 0;
            int j = 0;
            while(j < s.length()){
                char c = s.charAt(j);
                if(map.containsKey(c)){
                    map.put(c, map.get(c) - 1);
                    if(map.get(c) >= 0) count--; 
                }
            
            while(count == 0 && i <= j){
                flag = true;
                int curLen = j + 1 - i;
                if(curLen <= min){
                    minLeft = i;
                    minRight = j;
                    min = curLen;
                }
                
                char leftC = s.charAt(i);
                if(map.containsKey(leftC)){
                    map.put(leftC, map.get(leftC) + 1);
                    if(map.get(leftC) >= 1) count++;
                }
                i++;
            } 
            j++;
        }
        return flag == true ? s.substring(minLeft, minRight + 1): "";
    }
}