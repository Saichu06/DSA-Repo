class rottenoranges {
    public int orangesRotting(int[][] grid) {
        // base
        if (grid.length == 0 || grid == null) {
            return -1;
        }

        int n = grid.length;
        int m = grid[0].length;
        int[][] rotten = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    rotten[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, rotten, i, j, 0);
                }
            }
        }

        int maxTime = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if (rotten[i][j] == Integer.MAX_VALUE) {
                        return -1;
                    } else {
                        maxTime = Math.max(maxTime, rotten[i][j]);
                    }
                }
            }
        }

        return maxTime;
    }

    public void dfs(int[][] grid, int[][] time, int i, int j, int currTime) {
        if (i < 0 || i >= time.length || j < 0 || j >= time[0].length || grid[i][j] == 0 || currTime > time[i][j]) {
            return;
        }

        time[i][j] = currTime;

        dfs(grid, time, i - 1, j, currTime + 1);
        dfs(grid, time, i, j - 1, currTime + 1);
        dfs(grid, time, i + 1, j, currTime + 1);
        dfs(grid, time, i, j + 1, currTime + 1);
    }
}