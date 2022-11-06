class Solution {
    public String orderlyQueue(String s, int k) {
        if(k==1){
            String t = s;
            for(int i=0, n=s.length(); i<n; i++){
                String a = s.substring(i) + s.substring(0,i);
                if(a.compareTo(t) < 0)
                    t = a;
            }
            return t;
        }else{
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }
    }
}