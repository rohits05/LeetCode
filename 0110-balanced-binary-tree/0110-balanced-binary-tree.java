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
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
    
    int dfsHeight(TreeNode root){
        if(root == null) return 0;
        
        int lH = dfsHeight(root.left);
        int rH = dfsHeight(root.right);
        
        if(lH == -1 || rH == -1) return -1;
        if(Math.abs(lH - rH) > 1) return -1;
        
        return Math.max(lH, rH) + 1;
    }
}