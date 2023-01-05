class Solution {
    public int majorityElement(int[] nums) {
        // Moore Voting Algo!
        int els =0, cnt =0;
        for(int item: nums){
            if(cnt == 0) els = item;
            if(item == els) cnt +=1;
            else cnt -=1;
        }
        return els;
    }
}