class Solution {
    public List<List<Integer>> threeSum(int[] num) {
       Arrays.sort(num);
        
       List<List<Integer>> res = new LinkedList<>();
        
       for(int i=0 ; i<num.length-2 ; i++){ // Loop for a (0-Third last el) for Triplet
           
           if(i==0 || (i>0 && num[i] != num[i-1])){
               int low = i+1,high =num.length-1;
               int sum = 0 - num[i];
               
               while(low < high){ // T-P Approach
                   
                   if(num[low] + num[high] ==sum){
                       res.add(Arrays.asList(num[i], num[low], num[high]));
                   
                       while(low < high && num[low]==num[low+1]) // Ignoring the Duplicates
                           low++;
                       while(low < high && num[high]==num[high-1])
                           high--;

                       low++;
                       high--;
                  }else if(num[low] + num[high] <sum) // Val of a-determination (Increasing R-Pointee)
                       low++;
                   else // Right pointer
                       high--;
               }
           }
       }
        return res;
    }
}