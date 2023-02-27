/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {
    public Node construct(int[][] grid) {
        int n = grid.length;
        return helper(grid, 0, 0, n, n);
    }

    private Node helper(int[][] grid, int x1, int y1, int x2, int y2) {
        if (isLeaf(grid, x1, y1, x2, y2)) {
            boolean val = grid[x1][y1] == 1 ? true : false;
            return new Node(val, true, null, null, null, null);
        }
        int midX = x1+(x2-x1)/2, midY = y1+(y2-y1)/2;
        Node topLeft = helper(grid, x1, y1, midX, midY);
        Node topRight = helper(grid, x1, midY, midX, y2);
        Node bottomLeft = helper(grid, midX, y1, x2, midY);
        Node bottomRight = helper(grid, midX, midY, x2, y2);
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }

    private boolean isLeaf(int[][] grid, int x1, int y1, int x2, int y2) {
        if(x2 == x1+1) return true;
        int val = grid[x1][y1];
        
        for(int i=x1; i<x2; i++){
            for(int j=y1; j<y2; j++)
                if(grid[i][j] != val) return false;
        }
        
        return true;
    }
}