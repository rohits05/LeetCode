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
    public static int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;
    }

    public int helper(TreeNode root, int k) {
        if (root == null) return 0;
        
        int leftCount = helper(root.left, k);
        int rightCount = helper(root.right, k - leftCount - 1);
        if (k == leftCount + 1)  ans = root.val;
        
        return leftCount + rightCount + 1;
    }
}