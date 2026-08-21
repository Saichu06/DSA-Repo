import java.util.*;
class tripletSumInRange {

     public int countTriplets(int[] arr, int l, int r) {

         Arrays.sort(arr);

         long count = 0;

         for(int i = 0; i < arr.length - 2; i++) {

             count += countLessThan(arr, r + 1, i);
             count -= countLessThan(arr, l, i);
         }

         return (int) count;
     }

     private long countLessThan(int[] arr, int limit, int i) {

         int left = i + 1;
         int right = arr.length - 1;

         long count = 0;

         while(left < right) {

             int sum = arr[i] + arr[left] + arr[right];

             if(sum < limit) {

                 count += right - left;
                 left++;

             } else {

                 right--;
             }
         }

         return count;
     }
 }