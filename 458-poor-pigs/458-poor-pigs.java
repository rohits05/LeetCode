class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int res = minutesToTest/minutesToDie; 
        
        return (int)Math.ceil(Math.log(buckets) / Math.log(res+1));
    }
}