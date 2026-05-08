public class Main {
    public static void main(String[] args) {
        // Your Code goes here!
        String str="((a+b)+((c+d)))";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=')'){
                st.push(ch);
            }
            else{
                int c=0;
                while(!st.isEmpty() && st.peek()!='('){
                    st.pop();
                    c++;
                }
                if(c<1){
                    return true;
                }
                else{
                    st.pop();
                }
            }
        }

        return false;
    }
}