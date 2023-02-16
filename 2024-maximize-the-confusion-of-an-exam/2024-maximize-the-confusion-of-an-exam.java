class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        boolean[] arr = new boolean[answerKey.length()];
        for(int i=0; i<answerKey.length(); i++)
            if(answerKey.charAt(i) == 'T') arr[i] = true;
        
        int zeros = 0, ones = 0, max = Math.min(arr.length,  2*k);
        int left = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]) ones++;
            else zeros++;
            
            if(ones > k && zeros > k){
                if(arr[left]) ones--;
                else zeros--;
                left++;
            } else if(ones >= k && zeros >= k) max = Math.max(max, i-left+1);
        }
        max = Math.max(max, arr.length-1-left+1);
        
        return max;
    }
}