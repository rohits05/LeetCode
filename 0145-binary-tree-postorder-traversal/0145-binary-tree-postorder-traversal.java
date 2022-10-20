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
     ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        // recuRsive Approach !! 
        if(root == null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
        
//         List<Integer> trav = new ArrayList<Integer>();
//         Stack<TreeNode> pickup = new Stack<TreeNode>();
        
//         if(root == null) return trav;
//         TreeNode node = root;
        
//         while(node != null || !pickup.isEmpty() ){
//           if(node != null ){
//               pickup.push(node);
//               node = node.left;    
//           }else{
//               TreeNode temp = pickup.peek().right;
//               if(temp == null ){
//                   temp = pickup.pop();
//                   trav.add(temp.val);
                  
//                   while(!pickup.isEmpty() && temp == pickup.peek().right){
//                       temp = pickup.pop();
//                       trav.add(temp.val);
//                   }
//               }else
//                   node = temp;   
//           }      
//         }
//         return trav;
    }
}