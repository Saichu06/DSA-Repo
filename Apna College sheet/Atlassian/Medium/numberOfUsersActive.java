import java.util.*;
public class numberOfUsersActive {
     public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] log : logs) {
            int user = log[0];
            int minute = log[1];

            map.putIfAbsent(user, new HashSet<>());
            map.get(user).add(minute);
        }

        int[] ans = new int[k];

        for(Set<Integer> set : map.values()){
            ans[set.size()-1]++;
        }

        return ans;
    }
}
