class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        Stack<Integer> aux=new Stack<>();
        while(!st.isEmpty()){
            aux.push(st.pop());
        }
        
        st.addAll(aux);
        
    }
}
