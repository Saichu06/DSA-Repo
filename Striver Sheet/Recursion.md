// SUM OF N
public int sumOfNaturalNumbers(int N) {
        // Base case: if N is 1, return 1
        if (N == 1) {
            return 1;
        }
        // Recursive case: current number + sum of previous numbers
        return N + sumOfNaturalNumbers(N - 1);
}


// N TO 1 PRINT
public void printNumbers(int current) {
        // Base case: if current is less than 1, stop recursion
        if (current < 1)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next smaller number
        printNumbers(current - 1);
}


// FACTORIAL 
public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
}

// PALINDROME STRING

public boolean palindrome(int i, String s) {
        // Base Condition: If i exceeds half of the string, all the elements have been compared
        // and the string is a palindrome, return true.
        if (i >= s.length() / 2) return true;

        // If the start and end characters are not equal, it's not a palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        // If both characters are the same, increment i and check start+1 and end-1.
        return palindrome(i + 1, s);
}


// FIBONACCI 

public static int fibonacci(int N) {
        // Base case: return N if it's 0 or 1
        if (N <= 1) {
            return N;
        }

        // Recursive case: calculate previous two terms
        int last = fibonacci(N - 1);    // (N-1)th term
        int slast = fibonacci(N - 2);   // (N-2)th term

        return last + slast;
}