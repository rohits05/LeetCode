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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder(), d = new StringBuilder();
        
        // Travellers
        find(root, startValue, s);
        find(root, destValue, d);
        
        int i =0, maxI = Math.min(d.length(), s.length());
        while (i < maxI && s.charAt(s.length() - i - 1) 
                        == d.charAt(d.length() - i - 1)) i++;
        
        return "U".repeat(s.length() - i) + d.reverse().toString().substring(i);
    }
    
    public boolean find(TreeNode root, int sV, StringBuilder sb) {
        if(root.val == sV) return true;
        
        // In - Val!
        if(root.left != null && find(root.left, sV, sb)) sb.append("L");
        else if(root.right != null && find(root.right, sV, sb)) sb.append("R");
        return sb.length() > 0;
    }
}