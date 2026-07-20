import java.util.*;
class isPalindrome {
    int x = 121;
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x); 
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}