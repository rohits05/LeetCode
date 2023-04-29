class Solution {
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        int[][] modifiedQueries = new int[queries.length][4];
        
        for(int i=0; i<queries.length; i++){
            modifiedQueries[i][0] = queries[i][0];
            modifiedQueries[i][1] = queries[i][1];
            modifiedQueries[i][2] = queries[i][2];
            modifiedQueries[i][3] = i;
        }
        
        Arrays.sort(modifiedQueries,(a, b) -> a[2] - b[2]);
        Arrays.sort(edgeList, (a, b) -> a[2] - b[2]);
        int i =0, j =0;
        boolean[] answer = new boolean[modifiedQueries.length];
        DisjointSet disjointSet = new DisjointSet(n);

        while(i<modifiedQueries.length){
            while(j < edgeList.length && edgeList[j][2] < modifiedQueries[i][2]){
                disjointSet.union(edgeList[j][0], edgeList[j][1]);
                j++;
            }
            answer[modifiedQueries[i][3]] = disjointSet.findParent(modifiedQueries[i][0]) == disjointSet.findParent(modifiedQueries[i][1]);
            i++;
        }
        
        return answer;
    }
}

class DisjointSet {
    private int[] parent;
    private int[] rank;

    public DisjointSet(int n) {
        this.parent = new int[n];
        this.rank = new int[n];
        for(int i=1; i<n; i++)
            this.parent[i] = i;
    }

    public int findParent(int node) {
        if(this.parent[node]!=node) this.parent[node] = findParent(this.parent[node]);
        return this.parent[node];
    }

    public void union(int u, int v) {
        int uPar = findParent(u);
        int vPar = findParent(v);

        if(uPar == vPar) return;
        if(this.rank[uPar] < this.rank[vPar]) this.parent[uPar] = vPar;
        else if(this.rank[vPar] < this.rank[uPar]) this.parent[vPar] = uPar;
        else{
            this.parent[uPar] = vPar;
            this.rank[vPar]++;
        }
    }
}