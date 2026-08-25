package GFG.Oracle;
import java.util.*;
class searchPattern{
    ArrayList<Integer> search(String pat, String txt) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = pat.length();

        if(txt.length() < n) {
            return ans;
        }

        StringBuilder sb = new StringBuilder();

        // First window
        for(int i = 0; i < n; i++) {
            sb.append(txt.charAt(i));
        }

        if(sb.toString().equals(pat)) {
            ans.add(0);
        }

        // Slide the window
        for(int i = 1; i <= txt.length() - n; i++) {

            // Remove previous first character
            sb.deleteCharAt(0);

            // Add new character
            sb.append(txt.charAt(i + n - 1));

            if(sb.toString().equals(pat)) {
                ans.add(i);
            }
        }

        return ans;
    }
}