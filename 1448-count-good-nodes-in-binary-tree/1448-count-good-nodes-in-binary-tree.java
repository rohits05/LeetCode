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
    int cnt =0;
    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return cnt;
    }
    
    public void dfs(TreeNode node, int val){
        if(node == null) return;
        if(node.val >= val) cnt++;
        
        dfs(node.left, Math.max(val, node.val));
        dfs(node.right, Math.max(val, node.val));
    }
}