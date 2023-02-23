class Solution {
    public int maxArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) max = Math.max(arr[i], max);
        return max;
    }
    
    public int minArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) min = Math.min(arr[i], min);
        return min;
    }
    
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int[] val1 = new int[arr1.length];
        int[] val2 = new int[arr1.length];
        int[] val3 = new int[arr1.length];
        int[] val4 = new int[arr1.length];
        for(int i=0; i<arr1.length ; i++){
            val1[i] = i + arr1[i] + arr2[i];
            val2[i] = i - arr1[i] - arr2[i];
            val3[i] = i + arr1[i] - arr2[i];
            val4[i] = i - arr1[i] + arr2[i];
        }
        
        int result = 0;
        result = Math.max(result, maxArray(val1) - minArray(val1));
        result = Math.max(result, maxArray(val2) - minArray(val2));
        result = Math.max(result, maxArray(val3) - minArray(val3));
        result = Math.max(result, maxArray(val4) - minArray(val4));
        return result;
    }
}