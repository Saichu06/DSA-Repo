import java.util.*;

class maxDigitSum {
    public int findMax(int n) {
        String s = String.valueOf(n);
        int m = s.length();
        int maxSum = digitSum(n);
        int ans = n;
        for (int i = 0; i < m; i++) {
            int digit = s.charAt(i) - '0';
            if (digit == 0) {
                continue; // i cant do 0-1
            }
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(0, i));
            sb.append((char) ('0' + digit - 1));
            for (int j = i + 1; j < m; j++) {
                sb.append('9');
            }
            String currString = sb.toString();
            int curr = Integer.parseInt(currString);
            int currSum = digitSum(curr);

            if (currSum > maxSum || (currSum == maxSum && curr > ans)) {
                maxSum = currSum;
                ans = curr;
            }
        }

        return ans;
    }

    int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}