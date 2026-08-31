public class bestTimeStock4{
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] dp = new int[k+1][n+1];
        for(int i=1;i<=k;i++){
            int best = Integer.MIN_VALUE;
            for(int j=1;j<=n;j++){
                best = Math.max(best,dp[i-1][j-1]-prices[j-1]);
                dp[i][j] = Math.max(dp[i][j-1],prices[j-1]+best);
            }
        }

        return dp[k][n];
    }
}