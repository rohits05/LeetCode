class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int i = arr.length-2, j = arr.length-1;
        while(i >= 0 && arr[i] >= arr[i + 1]) i--;
        
        // Checking if we have the maximum permutation of our number
        if(i == -1) return -1;
        // If n = 6537421, so our j will be 5 (arr[j] = 4)
        while(arr[j] <= arr[i]) j--;
        char t = arr[i]; arr[i] = arr[j]; arr[j] = t;
        Arrays.sort(arr, i+1, arr.length); // reversal
        
        long res = Long.parseLong(new String(arr));
        if(res > Integer.MAX_VALUE) return -1; // range check-point!
        else return (int)res;
    }
}