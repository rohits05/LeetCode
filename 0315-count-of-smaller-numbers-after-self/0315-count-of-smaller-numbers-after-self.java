class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int[] res = new int[nums.length];
        int[] index = new int[res.length];
        for(int i=0; i<res.length; i++) index[i] = i;

        mergeSort(nums, index, 0, nums.length-1, res);
        List<Integer> list = new LinkedList<>();
        for(int i: res) list.add(i);
        return list;
    }
    
    private void merge(int[] nums, int[] index, int l1, int r1, int l2, int r2, int[] res) {
        int start =l1, count =0, p =0;
        int[] tmp = new int[r2 - l1 + 1];

        while(l1 <= r1 || l2 <= r2){
            if(l1 > r1) tmp[p++] = index[l2++]; 
            else if(l2 > r2){
                res[index[l1]] += count;
                tmp[p++] = index[l1++]; 
            }else if(nums[index[l1]] > nums[index[l2]]){
                tmp[p++] = index[l2++];
                count++;
            }else{
                res[index[l1]] += count;
                tmp[p++] = index[l1++];
            }
        }
        
        for(int i=0; i<tmp.length; i++) index[start+i] = tmp[i];
    }
    
    private void mergeSort(int[] nums, int[] index, int l, int r, int[] res) {
        if(l >= r) return;

        int mid = (l + r) / 2;
        mergeSort(nums, index, l, mid, res);
        mergeSort(nums, index, mid+1, r, res);
        merge(nums, index, l, mid, mid+1, r, res);
    }
}