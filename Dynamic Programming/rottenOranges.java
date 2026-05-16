class Solution {

    public int orangesRotting(int[][] grid) {

        if (grid == null || grid.length == 0)
            return -1;

        int n = grid.length;
        int m = grid[0].length;

        int[][] time = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1) {
                    time[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    dfs(grid, time, i, j, 0);
                }
            }
        }

        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(time[i][j]==Integer.MAX_VALUE) return -1;
                    ans=Math.max(time[i][j],ans);
                }
            }
        }

        return ans;
    }

    public void dfs(int[][] grid, int[][] time,
                    int row, int col, int currentTime) {

        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length ||
            grid[row][col] == 0 ||
            currentTime > time[row][col]) {

            return;
        }

        time[row][col] = currentTime;

        dfs(grid, time, row - 1, col, currentTime + 1);
        dfs(grid, time, row + 1, col, currentTime + 1);
        dfs(grid, time, row, col - 1, currentTime + 1);
        dfs(grid, time, row, col + 1, currentTime + 1);
    }
}