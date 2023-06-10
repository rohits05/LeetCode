class Solution {
    public int majorityElement(int[] nums) {
        // Moore's Voting Algo !!
        int el =0, cnt =0;
        for(int items: nums){
            if(cnt == 0) el =items; // fill up
            if(el == items) cnt +=1; // match & inc
            else cnt -=1; // disagree
        }
        
        return el;
    }
}