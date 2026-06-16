public class maxAreaIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    int current = helper(grid, i, j);
                    maxArea = Math.max(maxArea, current);
                }
            }
        }

        return maxArea;
    }

    public int helper(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length
                || grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0;

        return 1
                + helper(grid, row - 1, col)
                + helper(grid, row + 1, col)
                + helper(grid, row, col - 1)
                + helper(grid, row, col + 1);
    }
}
