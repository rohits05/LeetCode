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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[][] dp = new List[10][10];
        return helper(1, n , dp);
    }
    
    private List<TreeNode> helper(int start, int end, List<TreeNode>[][] dp){
        if(start > end){
            List<TreeNode> res = new ArrayList();
            res.add(null);
            return res;
        }
        
        if(dp[start][end] != null) return dp[start][end];
        List<TreeNode> list = new ArrayList();
        
        if(start == end) list.add(new TreeNode(start));
        else{
            for(int i=start; i<=end; i++){
                List<TreeNode> right = helper(i+1, end, dp);
                List<TreeNode> left = helper(start, i-1, dp);

                for(TreeNode r: right){
                    for(TreeNode l: left){
                        list.add(new TreeNode(i, l, r));
                    }
                }
            }
        }
        
        return dp[start][end] = list;
    }
}