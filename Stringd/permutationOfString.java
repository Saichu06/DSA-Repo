class permutationOfString {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m)
            return false;
        int[] freq = new int[26];
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        int[] check = new int[26];
        for (int i = 0; i < n; i++) {
            char c = s2.charAt(i);
            check[c - 'a']++;
        }

        boolean found = true;

        for (char c : s1.toCharArray()) {
            if (freq[c - 'a'] != check[c - 'a']) {
                found = false;
            }
        }

        if (found == true) {
            return true;
        }

        for (int i = n; i < m; i++) {
            int prev = i - n;
            check[s2.charAt(prev) - 'a']--;
            char c = s2.charAt(i);
            check[c - 'a']++;
            found = true;
            for (char ch : s1.toCharArray()) {
                if (freq[ch - 'a'] != check[ch - 'a']) {
                    found = false;
                }
            }
            if (found == true) {
                return true;
            }
        }

        return false;
    }
}