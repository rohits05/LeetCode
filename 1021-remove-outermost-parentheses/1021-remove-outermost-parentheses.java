class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        Stack<Character> h = new Stack<>();

        for (int i=0; i<S.length(); i++){
            if (h.size() == 1 && S.charAt(i) == ')') h.pop();
            else if (h.size() == 0 && S.charAt(i) == '(') h.push('(');
            else if (S.charAt(i) == ')')
            { s.append(")"); h.pop(); }
            else if (S.charAt(i) == '(')
            { s.append("("); h.push('('); }
        }
        
        return s.toString();
    }
}