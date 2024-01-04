class Solution {
    public void sortColors(int[] a) {
        int n =a.length;
        int low =0, mid =0, high = n-1;
        
        while(mid <= high){
            if(a[mid] == 0){
                    swap(a, low, mid);
                    low++; mid++;
            } else if(a[mid] == 1) mid++;
            else{
                    swap(a, mid, high);
                    high--;
            }
        }
    }
    
    private void swap(int a[], int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}