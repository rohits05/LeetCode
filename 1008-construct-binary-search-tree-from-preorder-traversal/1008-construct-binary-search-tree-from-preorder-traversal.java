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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        return construct(preorder, 0, n-1);
    }
    
    private TreeNode construct(int[] preorder, int start, int end) {
        if(start > end) return null;
        
        int mid = end + 1;
        for(int i=start; i<=end; i++){
            if(preorder[i] > preorder[start]){
                mid = i;
                break;
            }
        }
        
        TreeNode root = new TreeNode(preorder[start]);
        root.left = construct(preorder, start+1, mid-1);
        root.right = construct(preorder, mid, end);
        return root;
    }
}