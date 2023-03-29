class Node implements Comparable<Node> {
    int i, j, dis;
    
    public Node(int i, int j, int dis){
        this.i = i;
        this.j = j;
        this.dis = dis;
    }
    public int compareTo(Node node){
        return this.dis - node.dis;
    }
}

class Solution {
    public int minimumEffortPath(int[][] arr) {
        int[][] d = {{-1,0},{1,0},{0,-1},{0,1}};
        int rows = arr.length, cols = arr[0].length;
        int[][] isVis = new int[rows][cols];
        
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++) isVis[i][j] = 100000000;
        
        isVis[0][0] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(0, 0, 0));
        
        while(!pq.isEmpty()){
            Node curNode = pq.poll();
            int I = curNode.i, J = curNode.j;
            if(I == rows-1 && J == cols-1) break;
            int parentWei = curNode.dis;
            
            for(int ptr=0; ptr<4; ptr++){
                int i = I + d[ptr][0], j = J + d[ptr][1];
                if(i<rows && i>=0 && j<cols && j>=0){
                    int val = Math.abs(arr[i][j] - arr[I][J]);
                    val = Math.max(val, parentWei);
                    if(isVis[i][j] > val){
                        isVis[i][j] = val;
                        pq.add(new Node(i, j, val));
                    }
                }
            }
        }
        
        return isVis[rows-1][cols-1];
    }
}