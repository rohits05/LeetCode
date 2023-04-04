class Solution {
    public int partitionString(String s) {
        int ans =1;
        HashSet<Character> set = new HashSet<Character>();
        
        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))) set.add(s.charAt(i));
            else{
                ans++;
                set.clear();
                set.add(s.charAt(i));
            }
        }
        return ans;
    }
}