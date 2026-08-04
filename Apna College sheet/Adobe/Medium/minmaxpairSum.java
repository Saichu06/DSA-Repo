import java.util.*;
class minmaxpairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int left = n/2-1;
        int right = n/2;

        int max = Integer.MIN_VALUE;

        while(left>=0 && right<n){
            max = Math.max(max , nums[left]+nums[right]);
            left--;
            right++;
        }

        return max;
        // 2335 - 3,3 2,5
    }
}