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
        // recursive Approach !!
        List<Integer> in = new LinkedList<Integer>();
        if(root == null) return in;
        
        in.addAll(inorderTraversal(root.left));
        in.add(root.val);
        in.addAll(inorderTraversal(root.right));
        return in;
         
        // Iterative Approach !!
//         List<Integer> trav = new ArrayList<Integer>();
//         Stack<TreeNode> pickup = new Stack<TreeNode>();
        
//         TreeNode node = root;
        
//         while(true){
//             if(node != null){
//                 pickup.push(node);
//                 node = node.left;    
//             }else{
//                 if(pickup.isEmpty()) break;

//                 node = pickup.pop();
//                 trav.add(node.val);
//                 node = node.right;
//             }
//         }
//         return trav;       
    }
}