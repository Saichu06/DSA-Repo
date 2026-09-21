package SlidingWindow;

import java.util.*;

class maxAvgSubArray {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxsum = sum;
        int n = nums.length;
        for (int i = k; i < n; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            maxsum = Math.max(maxsum, sum);
        }

        return (double) maxsum / k;
    }
}