class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        // Step 1: build adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    graph.get(i).add(j);
                }
            }
        }

        // Step 2: DFS to count provinces
        boolean[] vis = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                count++;
                dfs(i, graph, vis);
            }
        }

        return count;
    }

    private void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] vis) {
        vis[node] = true;
        for (int nei : graph.get(node)) {
            if (!vis[nei]) {
                dfs(nei, graph, vis);
            }
        }
    }
}
