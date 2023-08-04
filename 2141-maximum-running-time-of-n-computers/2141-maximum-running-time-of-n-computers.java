class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long start =0, end =0, ans =0;
        
        for(int ele: batteries) end += ele;
        while(start <= end){
            long avgtime = start + (end - start) / 2;
            if(ispossible(n, batteries, avgtime)){
                ans = avgtime;
                start = avgtime + 1;
            }
            else end = avgtime - 1;
        } 
        
        return ans;
    }
    
    public boolean ispossible(int n, int[] batteries, long avgtime) {
        long duration =0;
        
        for(int ele: batteries){
            if(ele <= avgtime) duration += ele;
            else duration += avgtime;
        }
        
        return (duration >= avgtime * n);
    }
}