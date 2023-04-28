class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max =0, n =values.length;
        int[] posSum = new int[n];
        int[] negSum = new int[n]; 
        posSum[0] = values[0];
        
        for(int i=1; i<n;i++){
            posSum[i] = Math.max(values[i] + i, posSum[i-1]);
            negSum[i] = values[i] - i;
        }

        int j =1;
        while(j < n){
            max = Math.max(max, negSum[j] + posSum[j-1]);
            j++;
        }

        return max;
    }
}