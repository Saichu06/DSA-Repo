import java.math.BigInteger;
import java.util.*;

class factorialsOfLarge {
    public ArrayList<Integer> factorial(int n) {
        // code here

        BigInteger facto = fac(n);

        ArrayList<Integer> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        sb.append(facto);
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            ans.add(sb.charAt(i) - '0');
        }

        Collections.reverse(ans);

        return ans;
    }

    public BigInteger fac(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n).multiply(fac(n - 1));
    }
}