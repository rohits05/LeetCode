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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> trav = new ArrayList<Integer>();
        Stack<TreeNode> pickup = new Stack<TreeNode>();
        
        TreeNode node = root;
        
        while(true){
            if(node != null){
                pickup.push(node); //pushing into the stack
                node = node.left;    
            }else{
                if(pickup.isEmpty()){ // null case
                    break;
                }
                node = pickup.pop(); //whatever will be at TOS we take it
                trav.add(node.val);
                node = node.right;
            }
        }
        return trav;
    }
}