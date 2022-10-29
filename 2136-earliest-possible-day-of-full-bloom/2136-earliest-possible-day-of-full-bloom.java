class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int[][] pairs = new int[n][2];
        for(int i=0; i<n; i++){
            pairs[i][0] = plantTime[i];
            pairs[i][1] = growTime[i];
        }
        
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);
        int plantingDays = 0;
        int totalDays = 0;
        for(int[] pair : pairs){
            totalDays = Math.max(totalDays, plantingDays + pair[0] + pair[1]);
            plantingDays += pair[0];
        }
        return totalDays;
    }
}