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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList();
        if(root == null) {
            return result;
        }
        
        Deque<TreeNode> que = new LinkedList();
        que.add(root);
        while(!que.isEmpty()){
            int size= que.size();
            int oldS = size;
            double sum =0;
            while(size>0){
                TreeNode node = que.removeFirst();
                sum += node.val;
                if(node.left != null){
                    que.addLast(node.left);
                }
                 if(node.right != null){
                    que.addLast(node.right);
                }
                size--;
            }
            result.add(sum/oldS);
        }
        return result;
    }
}