package SlidingWindow;

import java.util.HashMap;

public class longestSubArray {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        // prefixsum and its starting index
        map.put(0, 1);
        int prefixSum = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                res = i + 1;
            }

            else if (map.containsKey(prefixSum - k)) {
                res = Math.max(res, i - map.get(prefixSum - k));
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return res;
    }
}
