import java.util.*;

class alternatingSubarray {
    public int alternatingSubarray(int[] nums) {
        int n = nums.length;
        int best = -1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                int delta = 1;
                int length = 1;
                int j = i + 1;
                while (j < n) {
                    if (nums[j - 1] + delta == nums[j]) {
                        length++;
                    } else {
                        break;
                    }
                    delta *= -1;
                    j++;
                }
                best = Math.max(best, length);
            }
        }

        return best;
    }
}