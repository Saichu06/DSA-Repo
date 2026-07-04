import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // where it should be one
                if (j == 0 || i == j) {
                    curr.add(1);
                } else {
                    int ansVal = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                    curr.add(ansVal);
                }
            }
            ans.add(curr);
        }

        return ans;
    }
}
