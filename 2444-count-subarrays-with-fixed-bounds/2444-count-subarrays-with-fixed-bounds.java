class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;

        for(int i=0; i<nums.length; i++)
          if(nums[i] >= minK && nums[i] <= maxK){
            int a =i, b =i, mini =0, maxi =0;
            while(++i != nums.length && (nums[i] >= minK && nums[i] <= maxK));
            while(true){
              for(; b!=i && (mini==0 || maxi==0); b++){
                if(nums[b] == minK) mini++;
                if(nums[b] == maxK) maxi++;
              }

              if(mini==0 || maxi==0) break;

              for(; mini!=0 && maxi!=0; ans += 1+(i-b), a++){
                if(nums[a] == minK) mini--;
                if(nums[a] == maxK) maxi--;
              }          
            }
          }

        return ans;    
    }
}