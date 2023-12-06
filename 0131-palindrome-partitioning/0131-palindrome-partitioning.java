class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> p = new ArrayList<>();
        func(0, s, p, ans);
        return ans;
    }
    
    void func(int idx, String s, List<String> p, List<List<String>> res){
        if(idx == s.length()){
            res.add(new ArrayList<>(p));
            return;
        }
        
        for(int i=idx; i<s.length(); i++){
            if(isPal(s, idx, i)){
                p.add(s.substring(idx, i+1));
                func(i+1, s, p, res);
                p.remove(p.size() - 1);
            }
        }
    }
    
    boolean isPal(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        
        return true;
    }
}