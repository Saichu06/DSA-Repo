import java.util.*;

public class baseballgame {
    public static void main(String[] args) {

        char[] ops = {'5','2','C','D','+'};

        Stack<Integer> st = new Stack<>();

        for(char c : ops){

            if(c == 'C'){
                st.pop();
            }
            else if(c == 'D'){
                st.push(st.peek() * 2);
            }
            else if(c == '+'){

                int first = st.pop();
                int second = st.peek();

                st.push(first);
                st.push(first + second);
            }
            else{
                st.push(c - '0');
            }
        }

        int sum = 0;

        while(!st.isEmpty()){
            sum += st.pop();
        }

        System.out.println(sum);
    }
}