class subarrayProductlessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1)
            return 0;

        int prefixProduct = 1;
        int left = 0;
        int right = 0;
        int n = nums.length;
        int count = 0;

        while (right < n) {

            prefixProduct *= nums[right];

            while (prefixProduct >= k) {
                prefixProduct /= nums[left];
                left++;
            }

            count += right - left + 1;

            right++;
        }

        return count;
    }
}