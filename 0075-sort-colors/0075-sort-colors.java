class Solution {
    public void sortColors(int[] a) {
        int low = 0, mid = 0, temp, high = a.length - 1;
        
        while(mid <= high){
            if(a[mid] == 0){
                    // temp = a[low];
                    // a[low] = a[mid];
                    // a[mid] = temp;
                    swap(a, low, mid);
                    low++;
                    mid++;
            } else if(a[mid] == 1) mid++;
            else{
                    // temp = a[mid];
                    // a[mid] = a[high];
                    // a[high] = temp;
                    swap(a, mid, high);
                    high--;
            }
        }
    }
    
    public void swap(int a[], int i, int j){
        int t;
        while(i < j){
            t = a[i]; a[i] = a[j]; a[j] = t;
            i++; j--;
        }
    }
}