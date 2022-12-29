class Solution {
     public long maxMatrixSum(int[][] matrix) {
        int countNegative = 0 ;
        for(int[] inner: matrix){
            for(int i: inner) if(i < 0) countNegative++ ;
        }
        
        long sum = 0;      
        if(countNegative%2 == 0 || countNegative == 0){
            for(int[] inner : matrix){
                for(int i: inner){
                    if(i < 0) sum += Math.abs(i);
                    else sum += i ;
                }
            }
        } else {
            int min = Integer.MAX_VALUE ;
            for(int[] inner: matrix){
                for(int i: inner) min = Math.min(min, Math.abs(i));
            }
            
            for(int[] inner: matrix){
                for(int i: inner){
                    if(i < 0) sum += Math.abs(i);
                    else sum += i ;
                }
            }
            sum -= 2*min ;
        }
        
        return sum ;
    }
}