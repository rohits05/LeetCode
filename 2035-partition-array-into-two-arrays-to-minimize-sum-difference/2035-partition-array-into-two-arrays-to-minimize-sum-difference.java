class Solution {
    public void solve(int []nums,int i, int sum, int count, int high, HashMap<Integer, ArrayList<Integer>> hm){
        if(i == high){
            hm.get(count).add(sum);
            return;
        } 
        
        solve(nums, i+1, sum+nums[i], count+1, high, hm);
        solve(nums, i+1, sum, count, high, hm);
    }
    
     public int minimumDifference(int[] nums) {
        int total= 0;
        for(int i: nums) total+=i;

        int target = total/2, min = Integer.MAX_VALUE, val = min;
        HashMap<Integer, ArrayList<Integer>> hm1 = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> hm2 = new HashMap<>();
         
        int half = nums.length/2;
        for(int i=0; i<=half; i++){
            hm1.put(i, new ArrayList<Integer>());
            hm2.put(i, new ArrayList<Integer>());
        }
         
        solve(nums, 0, 0, 0, half, hm1);
        solve(nums, half, 0, 0, nums.length, hm2);
         
        for(int i=0; i<=half; i++){
            ArrayList<Integer> list1 = hm1.get(i);
            ArrayList<Integer> list2 = hm2.get(half-i);
            Collections.sort(list1);
            Collections.sort(list2);
            int j = 0 , k = list2.size()-1;
            while(j<list1.size() && k>=0){
                int sum = list1.get(j) + list2.get(k);
                if(sum==target) return Math.abs(total-2*sum);
                else if(sum>target) k--;
                else j++;
                
                int diff = Math.abs(sum-target);
                if(diff<min){
                    min = diff;
                    val = sum;
                }
            }
            
        }
         
        return Math.abs(total - 2 * val);
    }
}