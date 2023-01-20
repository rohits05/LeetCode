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
    public void helper(TreeNode root,List<Integer> post){
        if(root == null) return;
        
        helper(root.left, post);
        helper(root.right, post);
        post.add(root.val);
    }
    
    ArrayList<Integer> list = new ArrayList<>(); // 1,2
    public List<Integer> postorderTraversal(TreeNode root) {
        // recuRsive Approach !! 
        // if(root == null) return list; # 1
        // postorderTraversal(root.left); # 1
        // postorderTraversal(root.right); #1
        // list.add(root.val);  # 1
        
        // helper(root, list); # 2
        // return list;  # 1,2
        
        // IteRaTive appRoach !!
        List<Integer> trav = new ArrayList<Integer>();
        Stack<TreeNode> pickup = new Stack<TreeNode>();
        
        if(root == null) return trav;
        TreeNode node = root;
        
        while(node != null || !pickup.isEmpty() ){
          if(node != null){
              pickup.push(node);
              node = node.left;    
          }else{
              TreeNode temp = pickup.peek().right;
              if(temp == null){
                  temp = pickup.pop();
                  trav.add(temp.val);
                  
                  while(!pickup.isEmpty() && temp == pickup.peek().right){
                      temp = pickup.pop();
                      trav.add(temp.val);
                  }
              }else node = temp;   
          }      
        }
        return trav;
    }
}