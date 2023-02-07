class Solution {
    public int getMaxLen(int[] arr) {
        int start =0, len =0, n= arr.length;
        boolean pos = true;
        
        for(int end=0; end<=n; end++){   
            if(end != n && arr[end] != 0){
                if(arr[end] < 0) pos = !pos;
                if(pos) len = Math.max(len, end-start+1);
            }
            else{
                while(start < end){
                    if(arr[start] < 0) pos = !pos;
                    if(pos) len = Math.max(len, end-start-1);
                    start++;
                }
                start = end+1;
                pos = true;
            }}
        
        return len;
    }
}