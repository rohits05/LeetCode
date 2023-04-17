class Solution {
    public int countOdds(int low, int high) {
//         if(low % 2 == 0) low++;
//         if(high % 2 == 0) high--;
        
//         return  (high - low) / 2+1;
           int len = high - low + 1; 
           if(high%2 != 0 && low%2 != 0) return (len / 2) + 1;
           else return len / 2;
    }
}