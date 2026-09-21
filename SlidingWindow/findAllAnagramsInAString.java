package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class findAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {

        int n = p.length();

        if (s.length() < n) {
            return new ArrayList<>();
        }

        StringBuilder sb = new StringBuilder();

        int[] freq = new int[26];

        for (char c : p.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder targetHash = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            targetHash.append(freq[i]).append('#');
        }

        String ana = targetHash.toString();

        // First window
        StringBuilder window = new StringBuilder();

        for (int i = 0; i < n; i++) {
            window.append(s.charAt(i));
        }

        List<Integer> answer = new ArrayList<>();

        String finalAns = hashing(window);

        if (finalAns.equals(ana)) {
            answer.add(0);
        }

        // Slide window
        for (int i = n; i < s.length(); i++) {

            window.deleteCharAt(0);
            window.append(s.charAt(i));

            String curr = hashing(window);

            if (curr.equals(ana)) {
                answer.add(i - n + 1);
            }
        }

        return answer;
    }

    public String hashing(StringBuilder sb) {

        int[] freq = new int[26];

        for (char c : sb.toString().toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder hashed = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            hashed.append(freq[i]).append('#');
        }

        return hashed.toString();
    }
}
