class Solution {
    public int getMaxLen(int[] nums) {
        int n =nums.length;
        int pos[ ] =new int[n];
        int neg[] = new int[n];
        if(nums[0] < 0) neg[0] += 1;
        else if(nums[0] > 0) pos[0] += 1;
        
        int res = pos[0];
        for(int i=1; i<n; i++){
            if(nums[i] == 0) continue;
            if(nums[i] < 0){
                if(neg[i-1] == 0) pos[i] = 0;
                else pos[i] = neg[i-1] + 1;
                neg[i] = pos[i-1] + 1;
            }else{
                pos[i] = pos[i-1] + 1;
                if(neg[i-1] == 0) neg[i] = 0;
                else neg[i] = neg[i-1] + 1;
            }
            res  =Math.max(res, pos[i]);
        }
        
        return res;
    }
}