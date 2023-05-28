class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 =nums1.length, n2=nums2.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n2];
        arr[(n2)-1] =-1;
        
        for(int i=n2-1; i>=0; i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()) st.pop();
            if(st.isEmpty()) arr[i] = -1;
            else arr[i] = st.peek();
            st.push(nums2[i]);
        }
        
        int[] num = new int[n1];
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++)
                if(nums1[i] == nums2[j]) num[i] = arr[j];
        }
        
        return num;
    }
}