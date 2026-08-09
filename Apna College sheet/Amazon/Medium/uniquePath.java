import java.util.Arrays;

public class uniquePath {
    int[][] memo = new int[100][100];

    public int uniquePaths(int m, int n) {

        for(int i = 0; i < m; i++){
            Arrays.fill(memo[i], -1);
        }

        return solve(m, n, 0, 0);
    }

    public int solve(int m, int n, int i, int j) {

        // Outside the grid
        if(i >= m || j >= n){
            return 0;
        }

        // Reached bottom-right
        if(i == m - 1 && j == n - 1){
            return 1;
        }

        // Already calculated
        if(memo[i][j] != -1){
            return memo[i][j];
        }

        // Move down + move right
        return memo[i][j] =
            solve(m, n, i + 1, j) +
            solve(m, n, i, j + 1);
    }
}
