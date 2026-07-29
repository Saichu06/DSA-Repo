import java.util.*;
public class shortestDistToChar {
    public int[] shortestToChar(String s, char c) {

        List<Integer> indexes = new ArrayList<>();
        int[] ans = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                indexes.add(i);
            }
        }

        for(int i = 0; i < s.length(); i++){

            int minDist = Integer.MAX_VALUE;

            for(int idx : indexes){
                minDist = Math.min(minDist, Math.abs(idx - i));
            }

            ans[i] = minDist;
        }

        return ans;
    }
}
