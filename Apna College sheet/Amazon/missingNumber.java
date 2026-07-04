class missingNumber {
    int[] nums = { 0, 1, 3 };

    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            sum ^= i;
        }
        // the sum is from 0 to n
        // n is the length of array
        for (int i = 0; i < n; i++) {
            sum ^= nums[i];
        }

        return sum;

    }
}
