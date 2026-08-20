import java.util.*;

public class largestPrimeSeq {

    static void generatePrimes(boolean[] isPrime, int n) {
        isPrime[0] = false;
        if (n >= 1) {
            isPrime[1] = false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int num = Integer.parseInt(s);

        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        generatePrimes(isPrime, num);

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            int temp = 0;

            for (int j = i; j < s.length(); j++) {

                temp = temp * 10 + (s.charAt(j) - '0');

                if (isPrime[temp]) {
                    max = Math.max(max, temp);
                }
            }
        }

        System.out.println(max);
    }
}