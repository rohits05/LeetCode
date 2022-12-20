class Solution {
    public long[] getDistances(int[] arr) {
        long[] res = new long[100001];
        long[] countArr = new long[100001];
        long[] pLArr = new long[100001];
        long[] pRArr = new long[100001];
        
        for(int i=0; i<arr.length; i++){
            countArr[arr[i]]++;
            pLArr[arr[i]] += i;
            res[i] += countArr[arr[i]] *i -pLArr[arr[i]];
        }
        
        countArr = new long[100001];
        for(int i=arr.length-1; i>=0; i--){
            countArr[arr[i]]++;
            pRArr[arr[i]] += i;
            res[i] += Math.abs(countArr[arr[i]] *i - pRArr[arr[i]]);
        }
        
        long[] r = new long[arr.length];
        for(int i=0; i<arr.length; i++) r[i] = res[i];
        return r;
    }
}