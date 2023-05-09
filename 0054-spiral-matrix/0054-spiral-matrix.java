class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList();
        if(matrix.length == 0) return ans; // base
        
        int rowStart =0, columnStart=0;
        int rowEnd =matrix.length-1, columnEnd =matrix[0].length-1;
        
        while(rowStart <= rowEnd && columnStart <= columnEnd){
            for(int i=columnStart; i<=columnEnd; i++) // tl - tr
                ans.add(matrix[rowStart][i]);
            rowStart++;
            
            for(int i=rowStart; i<=rowEnd; i++) // rt - rb
                ans.add(matrix[i][columnEnd]);
            columnEnd--;
            
            if(rowStart <= rowEnd)
                for(int i=columnEnd; i>=columnStart; i--) //br - bl 
                    ans.add(matrix[rowEnd][i]);
            rowEnd--;
            
            if(columnStart <= columnEnd)
                for(int i=rowEnd; i>=rowStart; i--) // lb - lt
                    ans.add(matrix[i][columnStart]);
            columnStart++;
        }
        
        return ans;
    }
}