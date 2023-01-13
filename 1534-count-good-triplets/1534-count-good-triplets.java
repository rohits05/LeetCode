class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt = 0;
        boolean f = false, s = false, t = false;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
               for(int k=j+1; k<arr.length; k++){
                   f = Math.abs(arr[i] - arr[j]) <= a;
                   s = Math.abs(arr[j] - arr[k]) <= b;
                   t = Math.abs(arr[i] - arr[k]) <= c;
                   if(f && s && t) cnt += 1;
               }
            }
        }
        return cnt;
    }
}