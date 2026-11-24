class maxSubArrayWithEqualProducts {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if (prod == g * l) {
                    max = Math.max(max, j - i + 1);
                }

                if (prod > 1_000_000_000L)
                    break;
            }
        }

        return max;
    }

    public long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}