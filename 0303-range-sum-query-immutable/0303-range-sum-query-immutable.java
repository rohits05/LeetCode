class NumArray {
    int[] sum;
	public NumArray(int[] nums) {
		for(int i=1; i<nums.length; i++) nums[i] += nums[i - 1];
		this.sum = nums;
	}

	public int sumRange(int i, int j) {
		return sum[j] - (i == 0 ? 0 : sum[i - 1]);
	}
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */