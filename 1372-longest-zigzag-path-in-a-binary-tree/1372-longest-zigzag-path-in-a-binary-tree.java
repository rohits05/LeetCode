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
    int longestPath =0;
    public int longestZigZag(TreeNode root) {
        longestZigZag(root, true);
        return longestPath;
    }

    private int longestZigZag(TreeNode node, boolean left) {
        if(node == null) return -1;

        int leftPath = longestZigZag(node.left, true) + 1;
        int rightPath = longestZigZag(node.right, false) + 1;
        longestPath = Math.max(longestPath, Math.max(leftPath, rightPath));
        return left ? rightPath : leftPath;
    }
}