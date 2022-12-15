class Solution {
    public int minimumDeletions(String s) {
        int bcount = 0, deletions = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b') bcount++;
            else{
                deletions++;
                deletions = Math.min(deletions, bcount);
            }
        }
        
        return deletions;
    }
}