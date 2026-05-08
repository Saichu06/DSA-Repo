class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {

        // Case 1: k = 1
        int kad1 = kandane(arr, 1);
        if (k == 1) {
            return Math.max(0, kad1);
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int kad2 = kandane(arr, 2);

        // Case 2: sum > 0
        if (sum > 0) {
            return Math.max(0, kad2 + (k - 2) * sum);
        }
        // Case 3: sum <= 0
        else {
            return Math.max(0, kad2);
        }
    }

    public int kandane(int[] arr, int c) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < arr.length * c; i++) {
            currsum += arr[i % arr.length];
            maxsum = Math.max(maxsum, currsum);
            if (currsum < 0) currsum = 0;
        }

        return maxsum;
    }
}