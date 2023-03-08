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
    private void inOrder(TreeNode root , ArrayList<Integer> list){
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    
    TreeNode makeBST(ArrayList<Integer> list , int l , int h){
        if(l>h) return null;
        int mid = (l+h)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = makeBST(list, l, mid-1);
        root.right = makeBST(list, mid+1, h);
        return root;
    }
    
    public TreeNode balanceBST(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return makeBST(list, 0, list.size()-1);
    }
}