class Solution {
    public int minFlipsMonoIncr(String s) {
        int flipCnt =0, oneCnt =0;
        
        for (char c: s.toCharArray()) {
            if(c == '0'){
                if(oneCnt == 0) continue;
                else flipCnt++;
            } else oneCnt++;
            
            if(flipCnt > oneCnt) flipCnt = oneCnt;
        }
        
        return flipCnt;
    }
}