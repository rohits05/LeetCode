class Solution {
    int tmp = 0;
    int[] dummy = new int[1001];
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        
        for(int i: arr1) dummy[i]++;
        for(int i: arr2) while(dummy[i]-- > 0) res[tmp++] = i;
        for(int i=0; i<dummy.length; i++)
            if(dummy[i] > 0) 
                while(dummy[i]-- > 0) res[tmp++] = i;
        
        return res;
    }
}