class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
         int[] temp = new int[52];
    
         for(int i=0; i<ranges.length; i++){
             int start = ranges[i][0], end = ranges[i][ranges[0].length-1];
             temp[start] += 1;
             temp[end+1] += -1;
         } 
        
         for(int i=1; i<temp.length; i++) temp[i] += temp[i-1];

         for(int i=left; i<=right; i++)
            if(temp[i] == 0) return false;

        return true;
    }
}