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
    public TreeNode sortedArrayToBST(int[] nums) {
         return sortedArrayToBST(nums, 0, nums.length-1);
    }
    
    public TreeNode sortedArrayToBST(int[] nums, int lo, int hi) {
        if(lo > hi)
            return null;
        int mid = (hi-lo)/2+lo;
        TreeNode root = new TreeNode(nums[mid]);
        root.left =  sortedArrayToBST(nums, lo, mid-1);
        root.right =  sortedArrayToBST(nums, mid+1, hi);
        return root;
    }
}