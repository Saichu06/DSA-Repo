import java.util.Arrays;

public class rowcolumnequal {
    public int equalPairs(int[][] grid) {

        int n = grid.length;

        int[][] transpose = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                transpose[j][i] = grid[i][j];
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(Arrays.equals(grid[i], transpose[j])){
                    count++;
                }
            }
        }

        return count;
    }
}
