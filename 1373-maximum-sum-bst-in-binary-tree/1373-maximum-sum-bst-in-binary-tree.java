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
    static class Node {
        int min, max, val;
        public Node(int min, int max, int val) {
            this.min = min;
            this.max = max;
            this.val = val;
        };
    }
    
    public int maxSumBST(TreeNode root) {
        int[] result = {0};
        traverse(root, result);
        return result[0];
    }
    
    private Node traverse(TreeNode root, int[] result) {
        if(root == null) return new Node(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        
        Node left = traverse(root.left, result);
        Node right = traverse(root.right, result);
        
        if(root.val > left.max && root.val < right.min){
            int curSum = left.val + right.val + root.val;
            result[0] = Math.max(curSum, result[0]);
            return new Node(Math.min(root.val, left.min), 
                       Math.max(root.val, right.max), curSum);
        }
        
        return new Node(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
}