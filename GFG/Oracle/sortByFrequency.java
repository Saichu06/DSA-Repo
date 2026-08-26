package GFG.Oracle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortByFrequency {
    static boolean compare(Map.Entry<Integer, Integer> m1,
                           Map.Entry<Integer, Integer> m2) {

        // Higher frequency comes first
        if(m1.getValue().equals(m2.getValue())) {

            // If frequency is same, smaller number comes first
            return m1.getKey() < m2.getKey();
        }

        return m1.getValue() > m2.getValue();
    }

    public ArrayList<Integer> sortByFreq(int arr[]) {

        Map<Integer, Integer> m = new HashMap<>();

        // Count frequency
        for(int num : arr) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        // Convert map entries into list
        List<Map.Entry<Integer, Integer>> list =
            new ArrayList<>(m.entrySet());

        // Sort
        Collections.sort(list, (m1, m2) -> {
            return compare(m1, m2) ? -1 : 1;
        });

        // Build answer
        ArrayList<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : list) {

            int freq = entry.getValue();

            while(freq-- > 0) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}
