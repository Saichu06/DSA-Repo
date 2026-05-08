class Solution {
    public String reverse(String S) {
        // code here
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.toString();
        
    }
}