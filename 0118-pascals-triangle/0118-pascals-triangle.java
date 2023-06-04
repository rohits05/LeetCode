class Solution {
    public List<List<Integer>> generate(int n) {
//      List<List<Integer>> result = new ArrayList<List<Integer>>();
// 	    List<Integer>row,prev = null;
        
// 	    for(int i=0; i<numRows; i++){
// 	    	row = new ArrayList<Integer>();
            
// 	    	for(int j=0; j<=i; ++j)
// 	    		if(j == 0 || j == i) row.add(1);
//                 else row.add(prev.get(j - 1) + prev.get(j));     
//             prev = row;
//             result.add(row);
// 	    }
        
// 	    return result;
        
        int[][] arr = new int[n][]; // R - wise !!
        
        for(int i=0; i<n; i++){
            int[] row = new int[i + 1];
            row[0] = 1; row[i] = 1; // start ptr
            
            for(int j=1; j<i; j++)
                row[j] = arr[i - 1][j - 1] + arr[i - 1][j];
            arr[i] = row;
        }
        
        return (List)Arrays.asList(arr);
    }
}

