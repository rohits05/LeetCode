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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length; i++) inMap.put(inorder[i], i);

        TreeNode root = buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inMap);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int posStart, int posEnd, Map<Integer, Integer> inMap){
        if(posStart > posEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[posEnd]);
        int inRoot = inMap.get(postorder[posEnd]);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(inorder, inStart, inRoot-1 , 
                              postorder , posStart , posStart + numsLeft - 1 , inMap);

        root.right = buildTree(inorder, inRoot + 1, inEnd, 
                               postorder, posStart + numsLeft, posEnd - 1, inMap);
        
        return root;
    }
}