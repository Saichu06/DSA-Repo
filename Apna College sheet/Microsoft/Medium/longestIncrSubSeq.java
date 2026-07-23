import java.util.Arrays;
public class longestIncrSubSeq {
    int[] nums = {1,3,5,1,3,10,8};
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);

        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
        }

        return max;
    }
}
