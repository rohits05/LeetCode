class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> que = new LinkedList<>();
        
        for(int i=1; i<=n ; i++) que.offer(i);
        
        while(que.size() != 1){
            for(int j=0; j<k-1; j++)  que.offer(que.poll());
            que.poll();
        }
        return que.poll();
    }
}