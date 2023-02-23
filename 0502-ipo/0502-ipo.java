class Solution {
    
    class pair {
        int cap, pro;
        
        pair(int cap, int pro) {
            this.cap = cap;
            this.pro = pro;
        }
    }
    
    public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
        int n =p.length;
        PriorityQueue<Integer> pq= new PriorityQueue<>((x, y) -> y-x);
        pair a[] = new pair[n];
        
        for(int i=0; i<n; i++) a[i] = new pair(c[i], p[i]);
        Arrays.sort(a, (x, y) -> x.cap - y.cap);
        
        int i =0;
        while(k-->0){
            while(i<n && a[i].cap<=w){
                pq.add(a[i].pro);
                i++;
            }
            if(pq.size() == 0) return w;
            w += pq.poll();
        }
        
        return w;
    }
}