import java.util.*;
public class largestPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int max = 0;

        for(char c : s.toCharArray()){
            int curr = c-'0';
            max=Math.max(curr,max);
        }

        System.out.println(max);
    }
}
