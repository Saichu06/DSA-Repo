import java.util.Arrays;

public class sumInMatrix {
    public int matrixSum(int[][] nums) {
        int ans = 0;
        for(int[] row : nums){
            Arrays.sort(row);
        }

        int n = nums.length;
        int m = nums[0].length;
        for(int j=0;j<m;j++){
            int x=0;
            for(int i=0;i<n;i++){
                x=Math.max(x , nums[i][j]);
            }
            ans+=x;
        }
        return ans;
    }
}
