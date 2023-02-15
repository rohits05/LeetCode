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
    int resulT = Integer.MAX_VALUE;
    TreeNode pre;
    public void helper(TreeNode node){
        if(node == null) return;
        helper(node.left);

        if(pre != null) resulT = Math.min(resulT, node.val-pre.val);
        pre = node;
        helper(node.right);
    }
    
    public int minDiffInBST(TreeNode root){
        helper(root);
        return resulT;
    }
}