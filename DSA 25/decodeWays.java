public class decodeWays {
    String s = "1011233";

    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            int firstDigit = Integer.valueOf(s.substring(i - 1, i));
            int secondDigit = Integer.valueOf(s.substring(i - 2, i));

            if (firstDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            if (secondDigit >= 10 && secondDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}
