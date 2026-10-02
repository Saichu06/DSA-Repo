import java.util.ArrayList;
import java.util.List;

public class generatingParanthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generatingFunc(list, "", 0, 0, n);
        return list;
    }

    public void generatingFunc(List<String> ans, String curr, int open, int close, int n) {
        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        if (open < n) {
            generatingFunc(ans, curr + "(", open + 1, close, n);
        }

        if (close < open) {
            generatingFunc(ans, curr + ")", open, close + 1, n);
        }
    }
}