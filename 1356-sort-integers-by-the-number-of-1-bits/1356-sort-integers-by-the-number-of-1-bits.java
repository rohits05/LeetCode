class Solution {
    public int[] sortByBits(int[] arr) {
        int val = 10001;
        for(int i=0; i<arr.length; i++) arr[i] += Integer.bitCount(arr[i]) * val;
        
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) arr[i] %= val;     
        return arr;
    }
}