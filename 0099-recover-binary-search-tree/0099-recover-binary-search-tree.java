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
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    TreeNode first = null, second = null;
    public void recoverTree(TreeNode node) { 
        while(node != null){
            
            if(node.left == null){
                if(first == null && prev.val > node.val){
                    first = prev;
                    second = node;
                }else if(prev.val > node.val) second = node;
                prev = node;
                node = node.right;
                
            }else{
                TreeNode temp = node.left;
                while(temp.right != null && temp.right != node) temp = temp.right;
                
                if(temp.right == null){
                    temp.right = node;
                    node = node.left;
                }else{
                    if(first == null && prev.val > node.val){
                        first = prev;
                        second = node;
                    }else if(prev.val > node.val) second = node;
                    prev = node;
                    temp.right = null;
                    node = node.right;
                }
            }
        } 
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}