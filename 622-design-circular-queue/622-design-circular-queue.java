class MyCircularQueue {
    static int arr[] = new int[1000];
    int k,front,end;

    public MyCircularQueue(int k) {
        this.k = k;
        front = end = 0;
    }
    
    public boolean enQueue(int value) {
        if(end-front == k) return false;
        arr[end%k] = value;
        end++;
        return true;
    }
    
    public boolean deQueue() {
        if(front == end) return false;
        front++;
        return true;
    }
    
    public int Front() {
        return (isEmpty()) ? -1 : arr[front%k];
    }
    
    public int Rear() {
        return (isEmpty()) ? -1 : arr[(end-1) % k];
    }
    
    public boolean isEmpty() {
        return end == front;
    }
    
    public boolean isFull() {
        return end - front == k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */