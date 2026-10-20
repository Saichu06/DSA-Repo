public class sortableIntegers {
    public int sortableIntegers(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            if (check(nums, k)) {
                sum += k;
            }
        }
        return sum;
    }

    private boolean check(int[] a, int k) {
        int n = a.length;
        int prevMax = Integer.MIN_VALUE;
        for (int start = 0; start < n; start += k) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int descent = 0;
            for (int i = start; i < start + k; i++) {
                min = Math.min(min, a[i]);
                max = Math.max(max, a[i]);
                int next = (i + 1 < start + k) ? a[i + 1] : a[start];
                if (a[i] > next)
                    descent++;
            }

            if (descent > 1)
                return false;
            if (prevMax > min)
                return false;

            prevMax = max;
        }

        return true;
    }
}
