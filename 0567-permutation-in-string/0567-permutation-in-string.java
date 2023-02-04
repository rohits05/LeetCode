class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> test = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            test.put(s1.charAt(i) , 0);
            if(map.containsKey(s1.charAt(i)) == false)
                map.put(s1.charAt(i), 1);
            else
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
        }
        
        int find = s1.length();
        int count = 0, correct = 0, extra = 0, get = s1.length();
        for(int i=0; i<s2.length(); i++){
            count++;
            if(map.containsKey(s2.charAt(i))){
                correct++;
                test.put(s2.charAt(i), test.get(s2.charAt(i)) + 1);
                if(test.get(s2.charAt(i)) > map.get(s2.charAt(i))) extra++;
            }
            
            if(count > find){
                count--;
                if(map.containsKey(s2.charAt(i - find))){
                    correct--;
                    test.put(s2.charAt(i - find), test.get(s2.charAt(i - find)) - 1);
                    if(test.get(s2.charAt(i - find)) >= map.get(s2.charAt(i - find)))
                        extra--;
                }
            }
            if(correct == find && extra == 0)return true;
        }
        
        return false;   
    }
}