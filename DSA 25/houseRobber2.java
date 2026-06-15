public class houseRobber2 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int[] firstinc = new int[n - 1];
        int[] firstexc = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            firstinc[i] = nums[i];
            firstexc[i] = nums[i + 1];
        }

        int firstincluded = robHelper(firstinc);
        int firstexcluded = robHelper(firstexc);

        return Math.max(firstincluded, firstexcluded);
    }

    public int robHelper(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        if (n == 1)
            return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}
