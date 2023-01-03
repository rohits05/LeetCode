class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt =0;
        
        for(int i=0; i<strs[0].length(); i++){
            int tmp =0;
        	for(int j=0; j<strs.length; j++) {
        		int check = strs[j].charAt(i);
        		if(check >= tmp) tmp = check;
        		else{
        			cnt++;
        			break;
        		}
        	}
        }
        
        return cnt;
    }
}