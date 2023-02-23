class Solution {
    public void sortColors(int[] a) {
        // Normal approach
        // Arrays.sort(a);
        
        // Better approach
        int low = 0, mid = 0, temp;
        int high = a.length - 1;
        while(mid <= high){
            if(a[mid] == 0){
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
            } else if(a[mid] == 1) mid++;
            else{
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
            }
        }
    }
}