import java.util.*;

class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String freq = getFreq(s);
            if (map.containsKey(freq)) {
                map.get(freq).add(s);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(freq, temp);
            }
        }

        return new ArrayList<>(map.values());
    }

    public String getFreq(String str) {
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append('#');
            sb.append(freq[i]);
        }

        return sb.toString();
    }
}