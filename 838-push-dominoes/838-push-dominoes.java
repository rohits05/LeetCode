class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] s = dominoes.toCharArray();
        char start = '.',end = '.';
        int startIdx = 0,i=0;
        
        while(i<n){
            startIdx =i;
            while(i<n && s[i] == '.')
                i++;
            if(i<n)
                end = s[i];
            if(i-startIdx>0){
                if(start == 'R' && end == 'L'){
                    int l = startIdx;
                    int r = i-1;
                    while(l<r){
                        s[l] = 'R';
                        s[r] = 'L';
                        l++;
                        r--;
                    }
                }
                else if(end == 'L'){
                    int l = i-1;
                    while(l>=startIdx){
                        s[l]= 'L';
                        l--;
                    }
                }
                else if(start == 'R'){
                    int r = startIdx;
                    while(r<i){
                        s[r] = 'R';
                        r++;
                    }
                }
            }
            start = end;
            i++;
            end = '.';
        }
        return new String(s);
    }
}