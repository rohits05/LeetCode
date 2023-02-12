class Solution {
    public int countPrimes(int n) {
        int cnT =0;
        boolean[] check = new boolean[n];
        
        for(int i=2; i<n; i++){
            if(check[i]) continue;
            cnT++;
            for(int j=i; j<n; j=j+i) check[j] = true;
        }

        return cnT; 
    }
}