public class countIslands{
    public int countIslands(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0 && !visited[i][j]) {
                    long curr = isIsland(i, j, grid, visited);

                    if (curr % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private long isIsland(int i, int j, int[][] grid,
                          boolean[][] visited) {
        if (i < 0 || j < 0 || i >= grid.length ||
            j >= grid[0].length || grid[i][j] == 0 ||
            visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;
        long sum = grid[i][j];

        sum += isIsland(i + 1, j, grid, visited);
        sum += isIsland(i - 1, j, grid, visited);
        sum += isIsland(i, j + 1, grid, visited);
        sum += isIsland(i, j - 1, grid, visited);

        return sum;
    }
}