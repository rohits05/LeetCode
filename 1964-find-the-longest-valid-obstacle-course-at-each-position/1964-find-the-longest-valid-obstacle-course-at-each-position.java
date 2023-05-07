class Solution {
    private int search(int[] nums, int start, int end, int target) {
        int left =start, right =end, boundary =0;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] > target){
                boundary = mid;
                right = mid - 1;
            }else left = mid + 1;
        }
        
        return boundary;
    }
    
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int i =-1, cur =0, lisSize =-1;
        int[] lis = new int[obstacles.length];
        int[] ans = new int[obstacles.length];

        for(int curHeight: obstacles){
            if(i == -1 || lis[i] <= curHeight){
                lis[++i] = curHeight;
                lisSize = i;
            }else{
                lisSize = search(lis, 0, i, curHeight);
                lis[lisSize] = curHeight;
            }
            ans[cur++] = lisSize + 1;
        }

        return ans;
    }
}