class Solution {
    public int minimumOperations(String num) {
        int n = num.length();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('2', '5');
        map.put('5', '0');
        map.put('7', '5');
        
        HashSet<Character> set = new HashSet<>();
        boolean containsZero = false;
        
        for(int i=n-1; i>=0; i--){
            char ch = num.charAt(i);
            if(ch == '0') containsZero = true;
            if(map.containsKey(ch) && set.contains(map.get(ch))) return (n-i-2);
            set.add(ch);
        }
        
        return ((containsZero) ? (n-1) : n);
    }
}