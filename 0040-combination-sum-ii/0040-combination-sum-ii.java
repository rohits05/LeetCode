class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        func(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    
    public void func(int idx, int arr[], int t, List<List<Integer>> ans, List<Integer> d){
        if(t == 0){
            ans.add(new ArrayList<>(d));
            return;
        }
        
        int n =arr.length;
        for(int i=idx; i<n; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i] > t) break;
            d.add(arr[i]);
            func(i+1, arr, t-arr[i], ans, d);
            d.remove(d.size() - 1);
        }
    }
}