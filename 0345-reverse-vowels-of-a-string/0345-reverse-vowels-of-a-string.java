class Solution {
     public String reverseVowels(String s) { 
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
         
        while(left < right){ 
            boolean leftV = isVowel(s.charAt(left)), rightV = isVowel(s.charAt(right));
            
            if(leftV && rightV) swap(arr, left, right);
            else if(leftV) left--;
            else if(rightV) right++;
            left++;
            right--;
        }
        return new String(arr);
    }
    
    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    } 
    
    
    public boolean isVowel(char c) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        for(char vow : vowels)
            if(c == vow) return true;
        
        return false;
    }
}