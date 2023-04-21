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
    TreeNode prev = null;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(prev != null){
            if(root.left == null && root.right == null && prev.left == root)
                return root.val;
        }
        
        prev = root;
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}