class MinStack {

    Stack<Pair<Integer,Integer>> stack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        Pair<Integer,Integer> pair = new Pair<>(val,val);
        
        if(!stack.isEmpty()){
            int minSoFar = stack.peek().getValue();
            min = Math.min(val, minSoFar);
            pair = new Pair<>(val, min);
        }
        
        stack.add(pair);
        
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().getKey();
    }
    
    public int getMin() {
        return stack.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
