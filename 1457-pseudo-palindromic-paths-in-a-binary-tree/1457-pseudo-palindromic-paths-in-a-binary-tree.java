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
    public int pseudoPalindromicPaths (TreeNode root) {
        int counter[] = new int[10];
        return palindromePathDFS(root, counter);   
    }
    
    int palindromePathDFS(TreeNode node, int[] counter) {
        if(node == null) return 0;
        counter[node.val]++;
        if(node.left == null && node.right == null) {
            if(checkPalindrome(counter)) {
                counter[node.val]--;
                return 1;
            } else {
                counter[node.val]--;
                return 0;
            }
        }
        int leftCount = palindromePathDFS(node.left, counter);
        int rightCount = palindromePathDFS(node.right, counter);
        counter[node.val]--;
        return leftCount + rightCount;
    }
    
    boolean checkPalindrome(int counter[]) {
        int odd = 0;
        for(int count: counter) {
            if(count%2 != 0) {
                if(odd == 1) return false;
                else odd = 1;
            }
        }
        return true;
    }
}