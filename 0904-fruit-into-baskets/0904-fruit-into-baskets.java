class Solution {
    public int totalFruit(int[] fruits) {
         Map<Integer,Integer> counter = new HashMap<>();
         int i =0, res =0;
        
         for(int j=0; j<fruits.length; j++){
             counter.put(fruits[j], counter.getOrDefault(fruits[j], 0)+1);
             while(counter.size()>2){
                 counter.put(fruits[i], counter.get(fruits[i])-1);
                 if(counter.get(fruits[i]) == 0) counter.remove(fruits[i]);
                 i++;
             }
             res = Math.max(res, j-i+1);
         }
        
        return res;
    }
}