class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }   

        for(int e[]:edges){
            int u=e[0];
            int v=e[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited=new boolean[n];

        return dfs(source,destination,graph,visited);
    }

    public boolean dfs(int source,int dest,ArrayList<Integer>[] graph,boolean[] vis){
        if(source==dest){
            return true;
        }

        vis[source]=true;
        for(int nei:graph[source]){
            if(!vis[nei]){
                if(dfs(nei,dest,graph,vis)){
                    return true;
                }
            }
        }
        return false;
    }
}