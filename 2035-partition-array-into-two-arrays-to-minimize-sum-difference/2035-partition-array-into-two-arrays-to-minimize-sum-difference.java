class Solution {
    HashMap<Integer, TreeSet<Integer>> leftMap = new HashMap<>();
    HashMap<Integer, TreeSet<Integer>> rightMap = new HashMap<>();

    public int minimumDifference(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        subsets(0, Arrays.copyOfRange(nums, 0, nums.length / 2), 0, 0, leftMap);
        subsets(0, Arrays.copyOfRange(nums, nums.length / 2, nums.length), 0, 0, rightMap);
        int ans = Integer.MAX_VALUE;
        for(int len: leftMap.keySet()){
            int rightArrayLen = nums.length / 2 - len;
            TreeSet<Integer> right = rightMap.get(rightArrayLen);
            if (right != null) {
                for(int leftSum: leftMap.get(len)){
                    int rightSum = sum / 2 - leftSum;
                    Integer closest = right.floor(rightSum);
                    if(closest != null){
                        int oneSum = (closest + leftSum);
                        int otherSum = sum - oneSum;
                        ans = Math.min(ans, Math.abs(oneSum - otherSum));
                    }
                }
            }
        }
        return ans;
    }

    private void subsets(int idx, int[] arr, int sum, int length, HashMap<Integer, TreeSet<Integer>> map) {
        if(idx >= arr.length){
            TreeSet<Integer> set = map.getOrDefault(length, new TreeSet<>());
            set.add(sum);
            map.put(length, set);
            return;
        }
        subsets(idx + 1, arr, sum, length, map);
        subsets(idx + 1, arr, sum + arr[idx], length + 1, map);
    }
}