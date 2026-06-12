import java.util.HashSet;
import java.util.Set;

public class longestSubStringwithnonrepeating {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            maxCount = Math.max(maxCount, i - left + 1);
            set.add(c);
        }

        return maxCount;
    }
}
