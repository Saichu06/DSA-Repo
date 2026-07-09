public class minSwapstoMakeStringAlternating {
    public int minSwaps(String s) {
        int zero = 0;
        int ones = 0;
        for (char c : s.toCharArray()) {
            int num = c - '0';
            if (num == 0)
                zero++;
            else
                ones++;
        }

        if (Math.abs(ones - zero) > 1) {
            return -1;
        }

        if (zero > ones) {
            swaps(s, '0');
        }

        if (ones > zero) {
            swaps(s, '1');
        }

        return Math.min(swaps(s, '0'), swaps(s, '1'));
    }

    public int swaps(String s, char expected) {
        int mismatch = 0;
        for (char c : s.toCharArray()) {
            if (c != expected) {
                mismatch++;
            }
            expected = (expected == 0) ? '1' : '0';
        }

        return mismatch / 2;
    }
}
