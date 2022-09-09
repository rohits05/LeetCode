class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || n == 0)
		    return res;

        int n1 = nums[0], n2 = nums[0], c1 = 0, c2 = 0;
        
        for(int i =0; i<n; i++) {
            if (nums[i] == n1)  c1++;
            else if (nums[i] == n2) c2++;
            else if (c1 == 0) { n1 = nums[i]; c1 = 1;}
            else if (c2 == 0) { n2 = nums[i]; c2 = 1;}
            else { c1--; c2--;}
        }
        c1 =0; c2 =0;
        for(int i=0; i<n; i++) {
            if(nums[i] == n1) c1++;
            else if (nums[i] == n2) c2++;
        }
        
        if(c1 > n/3)
            res.add(n1);
        if(c2 > n/3)
            res.add(n2);
        return res;
    }
}