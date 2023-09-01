class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersect = new HashSet<>();
        int idx1 =0, idx2 =0;
        int n = nums1.length, m = nums2.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(idx1<n && idx2<m){
            if(nums1[idx1] < nums2[idx2]) idx1++;
            else if(nums1[idx1] > nums2[idx2]) idx2++;
            else{
                intersect.add(nums1[idx1]);
                idx1++; idx2++;
            }
        }
        
        int res[] = new int[intersect.size()];
        int num = 0;
        
        for(Integer nums: intersect) res[num++] = nums;
        return res;
    }
}