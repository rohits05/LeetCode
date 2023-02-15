class FindSumPairs {
    HashMap<Integer , Integer> map = new HashMap<>();
    int[] nums1; int [] nums2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        
        for(int x: nums2)
            map.put(x, map.getOrDefault(x, 0)+1);
    }
    
    public void add(int index, int val) {
        int element = nums2[index];
        map.put(element, map.get(element)-1);
        nums2[index] += val;
        map.put(nums2[index], map.getOrDefault(nums2[index], 0)+1);
    }
    
    public int count(int tot) {
        int ans =0;
        for(int element: nums1)
            ans += map.getOrDefault(tot-element, 0);

        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */