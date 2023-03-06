class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(!st.empty() && st.peek() == s.charAt(i)) st.pop();
            else st.push(s.charAt(i));
        }
        
        StringBuilder ans = new StringBuilder();
        while (!st.empty()) 
            ans.append(st.pop());
        return ans.reverse().toString();
    }
}