class Solution {
    public int[] recoverArray(int n, int[] sums) {
        int m = sums.length;
        int left[] = new int[m/2], right[] = new int[m/2];
        Arrays.sort(sums);
        
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int diff = sums[1] - sums[0];
            int hasZero =0, p =-1, q =-1, k =0;
            
            for(int j=0; j<m; j++){
                if(k <= q && right[k] == sums[j]) k++;
                else{
                    if(sums[j] == 0) hasZero = 1;
                    left[++p] = sums[j];
                    right[++q] = sums[j] + diff;
                }
            }
            if(hasZero != 1){
                res[i] = -diff;
                sums = right;
            }else{
                res[i] = diff;
                sums = left;
            }
            m /= 2;
        }
        
        return res;
    }
}