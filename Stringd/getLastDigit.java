public class getLastDigit {
    public int getLastDigit(String a, String b) {
        // code here
        if (b.equals("0")) {
            return 1;
        }

        int n = a.length();

        int lastdigit = a.charAt(n - 1) - '0';

        int[][] lastDigitCycle = {
                { 0 },
                { 1 },
                { 2, 4, 8, 6 },
                { 3, 9, 7, 1 },
                { 4, 6 },
                { 5 },
                { 6 },
                { 7, 9, 3, 1 },
                { 8, 4, 2, 6 },
                { 9, 1 }
        };

        int len = lastDigitCycle[lastdigit].length;

        int mod = 0;

        for (char c : b.toCharArray()) {
            mod = (mod * 10 + (c - '0')) % len;
        }

        if (mod == 0) {
            mod = len;
        }

        return lastDigitCycle[lastdigit][mod - 1];
    }
}
