class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] res = new int[capacity.length];
        for(int i =0; i<capacity.length;i++)
               res[i] = capacity[i] - rocks[i];

        Arrays.sort(res);
        int ans = 0;
        for(int i=0; i<capacity.length; i++){
            if(res[i] == 0)
                ans++;
            else{
              if(additionalRocks >= res[i]){
                additionalRocks = additionalRocks - res[i];
                ans++;
               }else break; 
            }
        }
        return ans;
    }
}