class Solution {
    private int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, Math.abs(a - b));
    }
    
    public long makeSubKSumEqual(int[] arr, int k) {
        int n =arr.length, h =gcd(n, k), q =n/h;
        long ans =0;
        
        for(int i=0; i<h; i++){
            int x[] = new int[q];
            for(int j=0; j<q; j++) x[j] = arr[(h*j) + i];
            Arrays.sort(x);
            int v = q/2, u = q%2 == 0 ? (x[v] + x[v-1]) / 2 : x[v];
            for(int z=0; z<q; z++) ans += Math.abs(u-x[z]);
        }
        return ans;
    }
}