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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) return 0;

        PriorityQueue<Long> pq = new PriorityQueue<>(
            (a, b) -> {return b.compareTo(a);});
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            long levelSum =0;
            for(int i=0; i<size; i++){
                TreeNode cur = queue.poll();
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
                levelSum += cur.val;
            }
            pq.offer(levelSum);
        }
        
        if(pq.size() < k) return -1;
        
        long res = 0, k1 = k; 
        while(!pq.isEmpty() && k1 > 0){
            k1--;
            res = pq.poll();
        }
        return res;
    }
}