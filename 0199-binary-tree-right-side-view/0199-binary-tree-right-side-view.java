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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new ArrayList<Integer>();
        
        rightView(root, view, 0);
        return view;
    }
    
    public void rightView(TreeNode curr , List<Integer> view , int currDepth){
        if(curr == null) return;      
        if(currDepth == view.size()) view.add(curr.val);
        
        rightView(curr.right, view, currDepth + 1);
        rightView(curr.left, view, currDepth + 1);
    }
}