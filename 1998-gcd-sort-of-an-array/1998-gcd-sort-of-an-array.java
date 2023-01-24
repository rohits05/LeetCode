class Solution {
    int[] par;
    public int findPar(int u){
        if(par[u] == u) return u;
        
        return par[u] = findPar(par[u]);
    }
        
    public boolean gcdSort(int[] nums) {
        par = new int[100005];
        for(int i=0; i<100005; i++) par[i] = i;
        for(int e: nums){
            int c = e;
            for(int i=2; i<=Math.sqrt(c); i++){
                if(c%i == 0){
                    int p1 = findPar(c), p2 = findPar(i);
                    if(p1 != p2) par[p2] = p1;
                    int p3 = findPar(c/i);
                    
                    if(p1 != p3) par[p3] = p1;
                }
            }
        }
        
        int[] temp = nums.clone();
        Arrays.sort(temp);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != temp[i])
                if(findPar(nums[i]) != findPar(temp[i])) return false;
        }
        
        return true;
    }
}