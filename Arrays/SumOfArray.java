import java.util.*;

public class SumOfArray {

    // Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int solve(int[] A, int N) {

        // Step 1: Build Prefix Maximum
        int[] prefixMax = new int[N];
        prefixMax[0] = A[0];

        // Step 2: Update every element
        for (int i = 0; i < N; i++) {
            prefixMax[i] = Math.max(A[i], prefixMax[i - 1]);
        }

        // Step 3: Sort updated array
        Arrays.sort(A);

        int left = 0;
        int right = N - 1;

        int sum = 0;

        // Step 4: Pair smallest with largest
        while (left < right) {
            sum+=gcd(A[left],A[right]);
            left++;
            right--;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] A = { 6, 10, 15, 8 };

        System.out.println(solve(A, A.length));
    }
}