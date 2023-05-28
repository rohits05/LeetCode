class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int items: nums){ set.add(items); 
            if(set.size() > 3) set.remove(set.first()); // tc:3 
        }
        
        return (set.size() == 3) ? set.first() : set.last();
    }
}