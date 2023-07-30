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
    class Pair {
        int max, min;

        Pair(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }

    int ans;
    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        dfs(root);
        return ans;
    }

    public Pair dfs(TreeNode root){
        if(root == null) return new Pair(Integer.MIN_VALUE ,Integer.MAX_VALUE);
        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        int lMin = Integer.MAX_VALUE, rMin = Integer.MAX_VALUE;
        if(left.max != Integer.MIN_VALUE){
            lMin = Math.abs(root.val-left.max);
            ans = Math.min(lMin, ans);
        }            

        if(right.min != Integer.MAX_VALUE){
            rMin = Math.abs(root.val-right.min);
            ans = Math.min(rMin, ans);
        }

        int max = Math.max(left.max, Math.max(root.val, right.max));
        int min = Math.min(left.min, Math.min(root.val, right.min));
        return new Pair(max, min);
    }
}