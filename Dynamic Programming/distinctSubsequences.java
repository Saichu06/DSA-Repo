import java.util.Arrays;

public class distinctSubsequences {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();

        int[] dp = new int[n + 1];
        dp[0] = 1;

        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {

            int index = s.charAt(i) - 'a';

            // Take or don't take current character
            dp[i + 1] = (dp[i] * 2) % MOD;

            // Remove duplicate subsequences
            if (last[index] != -1) {
                dp[i + 1] = (dp[i + 1] - dp[last[index]] + MOD) % MOD;
            }

            last[index] = i;
        }

        // Remove empty subsequence
        return (dp[n] - 1 + MOD) % MOD;
    }
}