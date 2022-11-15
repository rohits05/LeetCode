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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;  
        int left = getHeightLeft(root);
        int right = getHeightRight(root);
        
        //Checking whether left & right subtree are equal or not ~ Complete BT Condition
        if(left == right) 
            return ((2 << (left)) -1); // Formula to calculate nodes ~ having Equal nodes  
        else 
            return countNodes(root.left) + countNodes(root.right) + 1; //OtherWise Recursively calculating of nodes adding 1 for root.
    }
    
    //Counting Left Height ~ Till It Exists
    public int getHeightLeft(TreeNode root){
        int count = 0;
        
        while(root.left != null){
            count++;
            root = root.left;
        }
        return count;
    }
    
    //Counting Right Height ~ Till It Exists
    public int getHeightRight(TreeNode root){
        int count = 0;
        
        while(root.right != null){
            count++;
            root = root.right;
        }
        return count;
    }
}