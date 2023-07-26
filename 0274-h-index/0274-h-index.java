class Solution {
    public int hIndex(int[] citations) {
        int k = 0, n =citations.length;
        Arrays.sort(citations);

        for(int i=n-1; i>=0; i--) 
            if(citations[i] >= n-i) k = n-i;
                
        return k;
    }
}