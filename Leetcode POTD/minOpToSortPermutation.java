class minOpToSortPermutation {
    public int minOperations(int[] nums) {
        int n = nums.length;
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] != (nums[0] + i) % n) {
                inc = false;
            }
            if (nums[i] != ((nums[0] - i) + n) % n) {
                dec = false;
            }
        }

        int ans = Integer.MAX_VALUE;

        if (inc) {
            int k = nums[0];
            if (k == 0)
                return 0;

            ans = Math.min(ans, Math.min((n - k) % n, k + 2));
        }

        if (dec) {
            int k = nums[0] + 1;
            ans = Math.min(ans, Math.min(k + 1, 1 + (n - k) % n));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}