class MyQueue {

    Stack<Integer> st;
    Stack<Integer> q;
    public MyQueue() {
        st=new Stack<>();
        q=new Stack<>();
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            q.push(st.pop());
        }
        q.push(x);

        while(!q.isEmpty()){
            st.push(q.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */