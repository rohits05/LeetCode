class Solution {
    public String multiply(String num1, String num2) {
//         if(num1.equals("0") || num2.equals("0")) return "0"; 
		
//         int[] ans=new int[num1.length() + num2.length()];
        
//         for(int i=num1.length()-1; i>=0; i--){
//             for(int j=num2.length()-1; j>=0; j--){  
//                  int valueIdx=i + j +1;
//                  int remainderIdx=i+ j ;
//                  int product=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
//                  product+=ans[valueIdx];
//                  ans[valueIdx]=product%10;
//                  ans[remainderIdx]+=product/10;  
//             }
//         }
        
//         boolean precedingZeros=true;
//         StringBuilder result=new StringBuilder("");
//         for(int i=0;i<ans.length;i++){
//              int value=ans[i];
//              if(value!=0) 
//                  precedingZeros=false;
//              if(!precedingZeros) 
//                  result.append(value);
//         }
//         return result.toString();
        
        // AnoTher AppRoach!!
        java.math.BigInteger str1 = new java.math.BigInteger(num1);;

        java.math.BigInteger str2 = new java.math.BigInteger(num2);

        java.math.BigInteger res = str1.multiply(str2);

        String result = res.toString(10);

        return result;
    }
}