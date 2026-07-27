public class stringtoNumber {
    public int myAtoi(String s) {
        int idx = 0;
        int ans = 0;
        int sign = 1;
        int n = s.length();
        // checking for white space
        while (idx < n && s.charAt(idx) == ' ') {
            idx++;
        }

        // checking for sign
        if (idx < n && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx) == '-')
                sign = -1;
            idx++;
        }

        // doing part
        while (idx < n && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            int curr = s.charAt(idx) - '0';
            // overflow condition
            if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && curr > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = ans * 10 + curr;

            idx++;
        }

        return ans * sign;
    }
}
