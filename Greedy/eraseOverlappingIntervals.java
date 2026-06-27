import java.util.*;

class eraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 0;

        int[] curr = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < curr[1]) {
                count++;
            } else {
                curr = intervals[i];
            }
        }

        return count;
    }
}