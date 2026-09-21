import java.util.*;

class findTwoNonOverlappingSubArray {

    public int minSumOfLengths(int[] arr, int target) {
        int left = 0;
        int n = arr.length;
        int prefixSum = 0;
        int answer = Integer.MAX_VALUE;
        int[] best = new int[n];
        Arrays.fill(best, Integer.MAX_VALUE);
        for (int right = 0; right < n; right++) {
            prefixSum += arr[right];
            while (prefixSum > target) {
                prefixSum -= arr[left];
                left++;
            }

            if (prefixSum == target) {
                int length = right - left + 1;

                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    answer = Math.min(
                            answer,
                            best[left - 1] + length);
                }

                if (right == 0) {
                    best[right] = length;
                } else {
                    best[right] = Math.min(best[right - 1], length);
                }
            }

            else {
                if (right > 0) {
                    best[right] = best[right - 1];
                }
            }
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}