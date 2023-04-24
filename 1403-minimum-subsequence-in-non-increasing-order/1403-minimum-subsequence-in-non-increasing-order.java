class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        int[] c = new int[101];
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            c[nums[i]]++;
        }
    
		int offset = sum%2 == 0 ? sum/2 : (sum/2) + 1;
        List<Integer> result = new ArrayList<>();
        for(int i=c.length-1; i>=0; i--){
			while(c[i] > 0){
                result.add(i);
                sum -= i;
                if(sum < offset){
                    i = 0;   
                    break;
                }    
                c[i]--;
            }
        }
        
        return result;
    }
}