import java.util.Stack;

public class min_Stack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min_st = new Stack<>();

    public void push(int value) {
        if (min_st.isEmpty() || min_st.peek() >= value) {
            min_st.push(value);
        }
        st.push(value);
    }

    public void pop() {
        if (!min_st.isEmpty() && min_st.peek().equals(st.peek())) {
            min_st.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min_st.peek();
    }
}
