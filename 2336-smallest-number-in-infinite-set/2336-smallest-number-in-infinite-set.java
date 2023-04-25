class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    boolean[] pop;
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        pop = new boolean[1001];
        for(int i=1; i<1001; i++){
            pq.offer(i);
            pop[i] = true;
        }
    }
    
    public int popSmallest() {
        int peek = pq.poll();
        pop[peek] = false;
        return peek;
    }
    
    public void addBack(int num) {
        if(pop[num] == false){
            pq.offer(num);
            pop[num] = true;
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */