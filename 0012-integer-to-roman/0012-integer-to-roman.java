class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "I");
        mp.put(4, "IV");
        mp.put(5, "V");
        mp.put(9, "IX");
        mp.put(10, "X");
        mp.put(40, "XL");
        mp.put(50, "L");
        mp.put(90, "XC");
        mp.put(100, "C");
        mp.put(400, "CD");
        mp.put(500, "D");
        mp.put(900, "CM");
        mp.put(1000, "M");
        StringBuilder sb = new StringBuilder();
        int[] a = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int n = a.length;
        for(int i=0; i<n && num>0; i++){
            while(num/a[i] >= 1){
                num -= a[i];
                sb.append(mp.get(a[i]));
            }
            if(num == 0) break;   
        }
        return sb.toString();
    }
}