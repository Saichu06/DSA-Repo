public class closedIslands {
    public int closedIsland(int[][] grid) {
        int closedIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (grid[i][j] == 0) {
                    if (isClosedIsland(i, j, grid, rows, cols)) {
                        closedIslands++;
                    }
                }
            }
        }

        return closedIslands;
    }

    private boolean isClosedIsland(int i, int j, int[][] grid, int rows, int cols) {
        // checking if already visited or it is water
        if (grid[i][j] == -1 || grid[i][j] == 1)
            return true;
        // it is a island now. we need to check the paramter
        if (onParameter(i, j, rows, cols))
            return false;
        // now if this passes then we are clear
        // recursively calling all 4 sides
        grid[i][j] = -1;
        boolean up = isClosedIsland(i + 1, j, grid, rows, cols);
        boolean right = isClosedIsland(i, j + 1, grid, rows, cols);
        boolean down = isClosedIsland(i - 1, j, grid, rows, cols);
        boolean left = isClosedIsland(i, j - 1, grid, rows, cols);

        return up && right && down && left;

    }

    private boolean onParameter(int i, int j, int rows, int cols) {
        return i == 0 || j == 0 || i == rows - 1 || j == cols - 1;
    }
}
