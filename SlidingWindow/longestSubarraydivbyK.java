package SlidingWindow;

import java.util.*;

class longestSubarraydivbyK {
    public int longestSubarrayDivK(int[] arr, int k) {
        // code here
        Map<Integer, Integer> bucket = new HashMap<>();
        int prefix = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix = ((prefix + arr[i]) % k + k) % k;
            if (prefix == 0) {
                ans = i + 1;
            } else if (bucket.containsKey(prefix)) {
                ans = Math.max(ans, i - bucket.get(prefix));
            } else {
                bucket.put(prefix, i);
            }
        }

        return ans;
    }
}