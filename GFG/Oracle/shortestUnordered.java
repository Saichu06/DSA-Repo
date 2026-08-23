package GFG.Oracle;

public class shortestUnordered {
    public int shortestUnorderedSubarray(int arr[]) {
        // Code Here
         int n = arr.length;

         // Check every consecutive triplet
         for (int i = 1; i < n - 1; i++) {
             // If middle element is a peak or valley,
             // unordered triplet exists
             if ((arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                 || (arr[i] < arr[i - 1]
                     && arr[i] < arr[i + 1])) {
                 return 3;
             }
         }
         
         return 0;
    }
}
