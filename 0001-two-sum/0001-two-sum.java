class Solution {
   public int[] twoSum(int[] numbers, int target) {
       int sum[] = new int[2];
       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       
       for(int i=0; i<numbers.length; i++){
           if(map.containsKey(target - numbers[i])){
               sum[0] = map.get(target - numbers[i]); 
               sum[1] = i;
               return sum;
           }
           map.put(numbers[i], i);
       }                                            
      return sum;
   }
}