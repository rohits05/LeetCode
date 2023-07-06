class MyStack {
    Queue<Integer> quyi = new LinkedList<Integer>();  
    
    public void push(int x) {
        quyi.add(x);
        int n = quyi.size();
        while(n-- > 1) quyi.add(quyi.poll());
    }
    
    public int pop() {
        return quyi.poll();
    }
    
    public int top() {
       return quyi.peek();
    }
    
    public boolean empty() {
       return quyi.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */