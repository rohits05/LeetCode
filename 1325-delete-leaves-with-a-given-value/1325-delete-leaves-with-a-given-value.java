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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return (targetLeaf(root, target) ? null : root);
    }
    
    public boolean targetLeaf(TreeNode root, int target) {
        if(root == null) return true;
        if(targetLeaf(root.left, target)) root.left = null;
        if(targetLeaf(root.right, target)) root.right = null;
        if(root.val == target && root.left == null && root.right == null) return true;
        return false;
    }
}