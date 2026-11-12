public class stringCompression {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;

        while (i < chars.length) {
            char curr = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }
            chars[idx++] = curr;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[idx++] = c;
                }
            }
        }

        return idx;
    }
}
