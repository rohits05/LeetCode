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
    public void flatten(TreeNode root) {
         FlattenHelper(root);
    }
    
    private TreeNode FlattenHelper(TreeNode root) {
        if(root == null) return null;
        
        var leftTail = FlattenHelper(root.left);
        var rightTail = FlattenHelper(root.right);
        var RightSubList = root.right;
        
        if(root.left != null) {
            root.right = root.left;
            leftTail.right = RightSubList;
        }
        else root.right = RightSubList;
        root.left = null;
        
        if(rightTail != null) return rightTail;
        else if(leftTail != null) return leftTail;
        else  return root;
    }
}