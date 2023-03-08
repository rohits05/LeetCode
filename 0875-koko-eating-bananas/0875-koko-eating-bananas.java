class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = Integer.MIN_VALUE;
        for(int pile: piles) maxPile = Math.max(maxPile, pile);

        int low = 1, high = maxPile;
        while(low < high){
            int mid = low+(high - low)/2;
            int completedTrips = 0;
            for(int t: piles){
                completedTrips += (t + mid - 1)/mid;
                if(completedTrips > h) break;
            }
            if(completedTrips > h) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}