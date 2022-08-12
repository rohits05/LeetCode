/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null || root == p || root == q) 
            return root;
        
        TreeNode leftOne = lowestCommonAncestor(root.left , p , q);
        TreeNode rightOne = lowestCommonAncestor(root.right , p , q);
        
        if(leftOne == null )
            return rightOne;
        if(rightOne == null )
            return leftOne;    
        else
            return root;
    }
}