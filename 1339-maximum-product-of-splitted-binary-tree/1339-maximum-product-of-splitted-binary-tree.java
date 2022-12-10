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
    long product = 0;
    public int maxProduct(TreeNode root) {
        long sum = sums(root);
        int a = helper(root, sum);
        
        return (int)(product % (int)(Math.pow(10, 9) + 7));
    }

    public int helper(TreeNode root,long upSum){
        if(root == null) return 0;
        
        int left = helper(root.left,upSum), right = helper(root.right,upSum);
        long tempP = Math.abs(upSum - right) > Math.abs(upSum - left) ? ((upSum - left) * left) : ((upSum - right) * right);
        
        product = Math.max(product, tempP);
        return (left + right + root.val);
    }

    public long sums(TreeNode root){
        if(root == null) return 0;
        
        long left = sums(root.left);
        long right = sums(root.right);
        return (root.val + left + right);
    }
}