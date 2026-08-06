import java.util.*;
public class kDiffPairs {
     int countPairs(int[] arr, int k) {
        int n = arr.length;  
        HashMap<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
          
            // Check if the complement (arr[i] + k)
            // exists in the map. If yes, increment count
            if (freq.containsKey(arr[i] + k)) 
                cnt += freq.get(arr[i] + k); 
          
            // Check if the complement (arr[i] - k)
            // exists in the map. If yes, increment count
            if (freq.containsKey(arr[i] - k)) 
                cnt += freq.get(arr[i] - k); 
          
            // Increment the frequency of arr[i]
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1); 
        }
        return cnt;
}
