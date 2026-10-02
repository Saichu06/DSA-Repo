
package SlidingWindow;

class minOperationsToMakexZero {
    public int minOperations(int[] nums, int x) {

        int totalSum = 0;
        int n = nums.length;

        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;

        if (target == 0) {
            return n;
        }

        if (target < 0) {
            return -1;
        }

        int left = 0;
        int total = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {

            total += nums[right];

            while (left <= right && total > target) {
                total -= nums[left];
                left++;
            }

            if (total == target) {
                maxLength = Math.max(
                        maxLength,
                        right - left + 1);
            }
        }

        return maxLength == 0 ? -1 : n - maxLength;
    }
}