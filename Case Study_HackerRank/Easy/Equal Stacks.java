import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

   public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    Stack<Integer> st3 = new Stack<>();

    fillStacks(h1, st1);
    fillStacks(h2, st2);
    fillStacks(h3, st3);

    while (!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty()) {
        int s1 = st1.peek();
        int s2 = st2.peek();
        int s3 = st3.peek();

        if (s1 == s2 && s2 == s3) {
            return s1;
        }

        if (s1 >= s2 && s1 >= s3) {
            st1.pop();
        } else if (s2 >= s1 && s2 >= s3) {
            st2.pop();
        } else {
            st3.pop();
        }
    }

    return 0;
}
    public static void fillStacks(List<Integer> h, Stack<Integer> st) {
    int sum = 0;
    for (int i = h.size() - 1; i >= 0; i--) {
        sum += h.get(i);
        st.push(sum);
    }
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
