class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        if(n%2!=0) return false;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(c=='[' || c=='{' || c=='('){
                st.push(c);
            }
            else if(c==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
            else if(c=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else if(c==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else{
                return false;
            }
        }

        return st.isEmpty();
    }
}