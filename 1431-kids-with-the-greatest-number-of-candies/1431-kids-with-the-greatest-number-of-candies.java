class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int N = candies.length, maxCandy = Integer.MIN_VALUE;
        
        for(int i=0; i<N; i++) maxCandy = Math.max(maxCandy,candies[i]);
        for(int i=0; i<N; i++){
            if(candies[i]+extraCandies < maxCandy) ans.add(false);
            else ans.add(true);
        }
        
        return ans;
    }
}