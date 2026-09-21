class minimumNumberGE {

    public String minimumNumber(String s) {
        // code here
        char[] arr = s.toCharArray();

        int[] freq = new int[10];

        for (char c : arr) {
            freq[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        if (freq[0] != 0) {
            int curr = 1;

            while (curr <= 9 && freq[curr] == 0) {
                curr++;
            }

            if (curr <= 9) {
                sb.append((char) (curr + '0'));
                freq[curr]--;
            }
        }

        int count = freq[0];

        while (count-- != 0) {
            sb.append('0');
        }

        for (int i = 1; i <= 9; i++) {
            int curr = freq[i];

            while (curr-- != 0) {
                sb.append((char) (i + '0'));
            }
        }

        return sb.toString();
    }
}
