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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return postOrder(nums, 0, nums.length-1);
    }
    
    public TreeNode postOrder(int[] nums,int low,int high){
        if(low > high) return null;
        
        int index = low;
        for(int i=low+1; i<=high; i++)
            if(nums[index] < nums[i]) index = i;
        
        TreeNode root = new TreeNode(nums[index]);
        root.left = postOrder(nums, low, index-1);
        root.right = postOrder(nums, index+1, high);
        return root;
    }
}