class MyStack {

    Deque<Integer> deque = new LinkedList<>();
    
    public MyStack() {
    }
    
    public void push(int x) {
        deque.addLast(x);
    }
    
    public int pop() {
        int x = deque.removeLast();
        return x;
    }
    
    public int top() {
        int x = deque.getLast();
        return x;
    }
    
    public boolean empty() {
        return deque.isEmpty();
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
