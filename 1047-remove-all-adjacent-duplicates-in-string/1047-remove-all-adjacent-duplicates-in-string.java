class Solution {
    public String removeDuplicates(String s) {
        if(s.length() == 1) return s;
        char[] array = s.toCharArray();
        int length = array.length, fast = 0, slow = 0;
        while(fast < length){
            if(slow == 0 || array[fast] != array[slow - 1]) array[slow++] = array[fast++];
            else{
                if(fast < length && array[fast] == array[slow - 1]) fast++;
                 slow--;
            }
        }
        return new String(array, 0, slow);
    }
}