package GFG.Oracle;

import java.util.HashMap;
import java.util.Map;

public class openTabs {
    class Solution {
        public int countTabs(String[] arr) {

            Map<String, String> map = new HashMap<>();

            for (String curr : arr) {

                if (!curr.equals("END")) {

                    if (!map.containsKey(curr)) {
                        map.put(curr, "Open");
                    } else {
                        if (map.get(curr).equals("Closed")) {
                            map.put(curr, "Open");
                        } else {
                            map.put(curr, "Closed");
                        }
                    }
                }

                else {
                    for (String key : map.keySet()) {
                        map.put(key, "Closed");
                    }
                }
            }

            int count = 0;

            for (String key : map.keySet()) {
                if (map.get(key).equals("Open")) {
                    count++;
                }
            }

            return count;
        }
    }
}
