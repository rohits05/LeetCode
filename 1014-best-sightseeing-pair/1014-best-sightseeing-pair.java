class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int max = Integer.MIN_VALUE, currentOptimal = values[0];

        for(int i=1; i<n; i++){
            currentOptimal = Math.max(currentOptimal-1, values[i-1]-1);
            max = Math.max(max, currentOptimal + values[i]);
        }

        return max;
    }
}