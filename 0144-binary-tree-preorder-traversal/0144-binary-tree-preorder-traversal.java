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
    public List<Integer> preorderTraversal(TreeNode root) {
        // Recursive Approach !!
        List<Integer> pre = new LinkedList<Integer>();
        if(root == null) return pre;
        
        pre.add(root.val);
        pre.addAll(preorderTraversal(root.left));
        pre.addAll(preorderTraversal(root.right));
        return pre;
                   
        // Iterative Approach !!
//         List<Integer> trav = new ArrayList<Integer>();    
//         if(root == null) return trav;
     
//         Stack<TreeNode> pickup = new Stack<TreeNode>();
//         pickup.push(root);
        
//         while(!pickup.isEmpty()){
//            root = pickup.pop();
//            trav.add(root.val);
            
//             if(root.right != null) pickup.push(root.right);
//             if(root.left != null) pickup.push(root.left);      
//         }
//         return trav;
    }
}