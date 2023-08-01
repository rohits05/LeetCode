class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new LinkedList();
        
        if(k == 0){
            ans.add(new LinkedList());
            return ans;
        }
        
        backtrack(1, new LinkedList<>(), n, k, ans);
        return ans;
    }
    
    public void backtrack(int start, LinkedList<Integer> current, int n, int k,                     List<List<Integer>> ans){
        if(current.size() == k) ans.add(new LinkedList(current));
        
        for(int i=start; i<=n && current.size()<k; i++){
            current.add(i);
            
            backtrack(i+1, current,n , k, ans);
            current.removeLast(); // trying new combos
        }
    }
}