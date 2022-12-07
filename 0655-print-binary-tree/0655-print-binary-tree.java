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
    // DFS ~ TechniQue!!
    public List<List<String>> printTree(TreeNode root) {
        int height = getTreeHeight(root);
        
        List<List<String>> result = new ArrayList<List<String>>();
        for(int i = 0; i <= height; i++) result.add(new ArrayList<String>());
        
        int columnCount = (int)Math.pow(2, height + 1) - 1;
        printTreeHelper(root, 0, (columnCount - 1) / 2, height, result);
        
        for(List<String> list : result) fillHolesWithEmpty(list, (int)Math.pow(2, height + 1) - 1);
        
        return result;
    }
    
    private void printTreeHelper(TreeNode root, int rowIndex, int columnIndex, int height, List<List<String>> matrix){ 
        if(root == null) return;
        
        List<String> currentRow = matrix.get(rowIndex);
        fillHolesWithEmpty(currentRow, columnIndex);
        currentRow.add(String.valueOf(root.val));
        
        int leftChildColumnIndex = columnIndex - (int)Math.pow(2, height - rowIndex - 1);
        int rightChildColumnIndex = columnIndex + (int)Math.pow(2, height - rowIndex - 1);
            
        printTreeHelper(root.left, rowIndex + 1, leftChildColumnIndex, height, matrix);
        printTreeHelper(root.right, rowIndex + 1, rightChildColumnIndex, height, matrix);
    }
    
    private void fillHolesWithEmpty(List<String> list, int targetSize){
        while(list.size() < targetSize) list.add("");   
    }
    
    private int getTreeHeight(TreeNode root){
        if(root == null) return -1;
        return Math.max(getTreeHeight(root.left), getTreeHeight(root.right)) + 1;
    }
}