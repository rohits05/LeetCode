/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
         int low = 0, high = n, mid = low + (high-low)/2;
        
         while(low <= high){
             mid = low + (high-low)/2;
             // All three possible guess
             if(guess(mid) == 0) return mid;
             else if(guess(mid) < 1) high = mid -1;
             else low = mid + 1;
         }
        
        return -1;
    }
}