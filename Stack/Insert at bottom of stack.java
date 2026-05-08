// User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        ArrayList<Integer> list=new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        st.push(x);
        for(int i=list.size()-1;i>=0;i--){
            st.push(list.get(i));
        }
        
        return st;
    }
}