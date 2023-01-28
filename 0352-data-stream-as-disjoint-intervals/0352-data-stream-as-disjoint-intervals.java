class SummaryRanges {
    TreeMap<Integer,Integer> intervals;
    public SummaryRanges() {
        intervals = new TreeMap<>();
    }
    
    public void addNum(int value) {
        int left =value, right =value;
        var justLow =intervals.floorEntry(value);

        if(justLow != null){
        	var justLowRight = justLow.getValue();
        	if(justLowRight >= value)return;
        	if(justLowRight == value-1) left = justLow.getKey();
        }
        
        var justHigh = intervals.higherEntry(value);
        if(justHigh != null && justHigh.getKey() == value+1){
        	right = justHigh.getValue();
        	intervals.remove(justHigh.getKey());
        }
        intervals.put(left, right);
    }
    
    public int[][] getIntervals() {
        return intervals.entrySet().stream()
        .map(e -> new int[]{e.getKey(), e.getValue()})
        .toArray(int[][]::new);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */