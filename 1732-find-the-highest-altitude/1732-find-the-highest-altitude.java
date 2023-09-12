class Solution {
    public int largestAltitude(int[] gain) {
        int maxI =0, alt =0, n =gain.length;
        
        for(int i=0; i<n; i++){
            alt += gain[i];
            if(alt > maxI) maxI = alt;
        }
        
        return maxI; 
    }
}