package GFG.Oracle;

import java.util.ArrayList;

public class maxZeroes {
    public String maxZero(ArrayList<String> arr) {

        int maxCount = 0;
        String ans = "-1";

        for(String number : arr) {

            int currCount = helper(number);

            if(currCount > maxCount) {
                maxCount = currCount;
                ans = number;
            }
            else if(currCount == maxCount && currCount > 0) {

                // Choose the larger number
                if(compare(number, ans) > 0) {
                    ans = number;
                }
            }
        }

        return ans;
    }

    public int helper(String number) {

        int count = 0;

        for(char c : number.toCharArray()) {
            if(c == '0') {
                count++;
            }
        }

        return count;
    }

    public int compare(String a, String b) {

        if(a.length() != b.length()) {
            return a.length() - b.length();
        }

        return a.compareTo(b);
    }
}
