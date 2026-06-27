import java.util.*;

public class RobotString {

    public String robotWithString(String s) {

        Stack<Character> ben = new Stack<>();
        StringBuilder kevin = new StringBuilder();

        int[] freq = new int[26];
        char[] ray = s.toCharArray();

        for (char c : ray) {
            freq[c - 'a']++;
        }

        int smallest = 0;

        for (char c : ray) {
            ben.push(c);

            freq[c - 'a']--;

            while (smallest < 26 && freq[smallest] == 0) {
                smallest++;
            }

            while (!ben.isEmpty()) {
                char top = ben.peek();

                if (smallest == 26 || (top - 'a') <= smallest) {
                    kevin.append(top);
                    ben.pop();
                } else {
                    break;
                }
            }
        }

        return kevin.toString();

    }

    public static void main(String[] args) {

        RobotString solution = new RobotString();

        String s = "zza"; // Ray

        System.out.println(solution.robotWithString(s));
    }
}