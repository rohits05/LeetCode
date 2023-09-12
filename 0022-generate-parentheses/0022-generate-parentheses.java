class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        fun(ans, sb, n, n);
        return ans;
    }
    
    private void fun(List<String> ls , StringBuilder sb , int l , int r) {
        if(l == 0 && r == 0){
            ls.add(sb.toString());
            return ; 
        }
        
        if(l > 0){
            sb.append('(');
            fun(ls, sb, l-1, r);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(l < r){
            sb.append(')');
            fun(ls, sb, l, r-1);
            sb.deleteCharAt(sb.length()-1);
        }
        
        return;
    }
}