class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) return new int[][]{newInterval};

		List<List<Integer>> ans=new ArrayList<>();
		int i =0;
        
		while(i<intervals.length){
			int s1 =intervals[i][0], e1 =intervals[i][1], 
            s2 =newInterval[0], e2 =newInterval[1];
			if(s1>e2){
			   List<Integer> temp=new ArrayList<>();
			   temp.add(newInterval[0]);temp.add(newInterval[1]);
				ans.add(temp); 
				while(i<intervals.length){
				   List<Integer> temp1=new ArrayList<>();
				   int s =intervals[i][0], e =intervals[i][1];
				   temp1.add(s); temp1.add(e);
				   ans.add(temp1);
				   i++;
				 }
                int res[][] = new int[ans.size()][2];
                for(int k=0; k<res.length; k++){
                    res[k][0] =ans.get(k).get(0);
                    res[k][1] =ans.get(k).get(1);
                }

                return res;
			}else if(s2>e1){
				List<Integer> temp = new ArrayList<>();
				temp.add(s1); temp.add(e1);
				ans.add(temp);
				i++;
			}
			else{
				s2 =Math.min(s1, s2);
				e2 = Math.max(e1, e2);
				newInterval[0] = s2;
				newInterval[1] = e2;
				i++;
			}
		}
        
		List<Integer> t = new ArrayList<Integer>();
		t.add(newInterval[0]); 
        t.add(newInterval[1]);
		ans.add(t);

		int res[][] = new int[ans.size()][2];
		for(int k=0; k<res.length; k++){
			res[k][0] = ans.get(k).get(0);
			res[k][1] = ans.get(k).get(1);
		}

		return res;
	}
}