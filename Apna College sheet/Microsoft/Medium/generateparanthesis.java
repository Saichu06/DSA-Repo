import java.util.*;
class generateparanthesis {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int openCount=0;
        int closeCount=0;
        String s="";
        n=n/2;
        helper(ans , openCount , closeCount , s , n);
        return ans;
    }
    
    public void helper(List<String> ans , int open , int close , String s , int n){
        if (open == n && close == n) {
    ans.add(s);
    return;
}

if (open > close) {
    helper(ans, open, close + 1, s + ")", n);
}

if (open < n) {
    helper(ans, open + 1, close, s + "(", n);
}
    }
}