class Solution {
    public int[] findBall(int[][] grid) {
        int row=grid.length, col = grid[0].length;
        int ans[]=new int[col];
        for(int i=0; i<col; i++){   
            int j = 0,k = i;
            boolean check=false;
            
            while(j<row && k<col){
                if(grid[j][k]==1){
                    if((k<col-1 && grid[j][k+1]==-1)  || (k==col-1 && grid[j][k]==1)){
                        check=true;
                        break;
                    }
                    k++;
                    j++;
                }
                else if(grid[j][k]==-1){
                    if((k>0 && grid[j][k-1]==1) || (k==0 && grid[j][k]==-1)){
                        check=true;
                        break;
                    }
                    j++;
                    k--;
                }
            }
            if(j==row && check==false) ans[i]=k; 
            else ans[i]=-1;
        }
        return ans;
    }
}