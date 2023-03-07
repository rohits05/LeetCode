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
    public int maxLevelSum(TreeNode root) {
        int level =1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int max = root.val, maximal = level, sum = 0;
        while(q.size() > 0){
            int size = q.size();
            level++;
            while(size-- > 0){
                TreeNode p = q.remove();
                if(p.left!=null){
                    sum+=p.left.val;
                    q.add(p.left);
                }
                if(p.right!=null){
                    sum+=p.right.val;
                    q.add(p.right);
                }
            }
            if(sum > max && q.size() > 0){
                max = sum;
                maximal = level;
            }
            sum = 0;
        }
        
        return maximal;
    }
}