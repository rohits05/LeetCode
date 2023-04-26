class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0;
		for(int n: nums){
			sum += n;

			while(n > 0){
				int dig = n%10;
				sum -= dig;
				n = n/10;
			}
		}

		return ((sum > 0) ? sum : -sum); 
    }
}