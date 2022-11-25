class Solution {
    int MOD = (int)(1e9 + 7);
    public int sumSubarrayMins(int[] arr) {
        int N = arr.length;
        long res = 0;
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0; i<N; i++) {
            while(!deque.isEmpty() && arr[deque.peekLast()] > arr[i]) {
                int pkIdx = deque.pollLast();
                int stIdx;
                if (deque.isEmpty()) stIdx = -1;
                else stIdx = deque.peekLast();
                res += (long)arr[pkIdx] * (long)(i - pkIdx) * (long)(pkIdx - stIdx);
            }
            deque.offerLast(i);
        }

        while (!deque.isEmpty()) {
            int pkIdx = deque.pollLast(), stIdx;
            if (deque.isEmpty()) stIdx = -1;
            else stIdx = deque.peekLast();
            res += (long)arr[pkIdx] * (long)(N - pkIdx) * (long)(pkIdx - stIdx);
        }
        return (int)(res % MOD);
    }
}