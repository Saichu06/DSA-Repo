public class sumOfSubarrayRanges {
    int[] nums = { 3, 1, 5, 6, 2, 42 };

    public long subArrayRanges(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int maxVal = nums[i];
            int minVal = nums[i];
            for (int j = i; j < n; j++) {
                maxVal = Math.max(maxVal, nums[j]);
                minVal = Math.min(minVal, nums[j]);
                sum += maxVal - minVal;
            }
        }
        return sum;
    }
}
