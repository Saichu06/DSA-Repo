public class lexGreaterPermutation {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int matched = 0;
        while (matched < n) {
            int c = target.charAt(matched) - 'a';
            if (count[c] == 0) {
                break;
            }
            count[c]--;
            matched++;
        }

        for (int pos = Math.min(matched, n - 1); pos >= 0; pos--) {
            if (pos < matched) {
                count[target.charAt(pos) - 'a']++;
            }

            int targetChar = target.charAt(pos) - 'a';
            for (int c = targetChar + 1; c < 26; c++) {
                if (count[c] > 0) {
                    count[c]--;
                    StringBuilder sb = new StringBuilder();
                    sb.append(target, 0, pos);
                    sb.append((char) ('a' + c));
                    for (int x = 0; x < 26; x++) {
                        while (count[x]-- > 0) {
                            sb.append((char) ('a' + x));

                        }
                    }

                    return sb.toString();
                }
            }
        }

        return "";
    }
}
