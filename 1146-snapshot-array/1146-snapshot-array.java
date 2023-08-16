class SnapshotArray {
    int sid = 0;
    HashMap<Integer, Integer>[] map = null;
    public SnapshotArray(int length) {
        map = new HashMap[length];
        for(int i=0; i<length; i++) map[i] = new HashMap<>();
    }
    
    public void set(int index, int val) {
        map[index].put(sid, val);
    }
    
    public int snap() {
        sid++;
        return sid-1;
    }
    
    public int get(int index, int snap_id) {
        while(snap_id >= 0 && !map[index].containsKey(snap_id)) snap_id--;
            
        if(snap_id < 0) return 0;
        return map[index].get(snap_id);
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */