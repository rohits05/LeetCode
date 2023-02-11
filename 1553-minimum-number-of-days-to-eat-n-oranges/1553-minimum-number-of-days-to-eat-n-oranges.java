class Solution {
    public int minDays(int n) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(n);
        int resulT = 0;
        Set<Integer> s = new HashSet<>();
        while(!que.isEmpty()){
            resulT++;
            int size = que.size();
            for(int i=0; i<size; i++){
                int cur = que.poll();
                if(cur == 0) return resulT - 1;
                if(s.contains(cur)) continue;
                else s.add(cur);

                if(cur % 3 == 0) que.offer(cur / 3);
                if(cur % 2 == 0) que.offer(cur / 2);
                que.offer(cur - 1);
            }
        }

        return resulT;
    }
}