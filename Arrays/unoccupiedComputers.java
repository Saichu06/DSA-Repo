import java.util.*;

class unoccupiedComputers {
    public int solve(int n, String s) {
        int count = 0;
        int occupied = 0;

        Map<Character, Boolean> map = new HashMap<>();

        for (char c : s.toCharArray()) {

            // First occurrence
            if (!map.containsKey(c)) {

                if (occupied < n) {
                    map.put(c, true);
                    occupied++;
                } else {
                    map.put(c, false);
                    count++;
                }

            }
            // Second occurrence
            else {

                // Only free computer if customer had one
                if (map.get(c)) {
                    occupied--;
                }

                map.remove(c);
            }
        }

        return count;
    }
}