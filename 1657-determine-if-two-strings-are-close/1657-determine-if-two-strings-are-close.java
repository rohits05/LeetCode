class Solution {
    public boolean closeStrings(String word1, String word2) {
       int[] freq1 = getFrequency(word1);
       int[] freq2 = getFrequency(word2);
       return compareFrequency(freq1, freq2);
    }

    public int[] getFrequency(String str) {
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++) freq[str.charAt(i) - 'a']++;
        return freq;
    }

    public boolean compareFrequency(int[] freq1, int[] freq2) {
        for(int i=0; i<26; i++)
            if((freq1[i] != freq2[i]) && (freq1[i] * freq2[i] == 0)) return false;

        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i=0; i<26; i++)
            if(freq1[i] != freq2[i]) return false; 

        return true;  
    }
}