/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer, Integer> hm;
    List<Integer> ans;
    int max = 1;
    private int solution(TreeNode root){
        if(root == null) return 0;
        
        int left = solution(root.left);
        int right = solution(root.right);
        
        int val = (root.val + left + right);
        if(hm.containsKey(val)){
            int count = hm.get(val)+1;
            hm.put(val, count);
            if(count > max){
                ans = new ArrayList<>();
                ans.add(val);
                max = count;
            }else if(count == max) ans.add(val);
        }else{
            hm.put(val, 1);
            if(max == 1) ans.add(val);
        }
        return val;
    }
    
    public int[] findFrequentTreeSum(TreeNode root) {
        hm = new HashMap<>();
        ans = new ArrayList<>();
        solution(root);
        int[] res = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) res[i] = ans.get(i);
        
        return res;
    }
}