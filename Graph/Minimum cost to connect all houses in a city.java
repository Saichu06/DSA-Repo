

class Solution {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        public Edge(int dest,int cost){
            this.dest=dest;
            this.cost=cost;
        }
        
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }
    public int minCost(int[][] houses) {
        // code here
        PriorityQueue<Edge> pq=new PriorityQueue<>();
        boolean[] vis=new boolean[houses.length];
        
        pq.add(new Edge(0,0));
        
        int finalcost=0;
        
        while(!pq.isEmpty()){
            Edge curr=pq.poll();
            if(vis[curr.dest]) continue;
            else{
                vis[curr.dest]=true;
                finalcost+=curr.cost;
                
                for(int i=0;i<houses.length;i++){
                    if(!vis[i] && i!=curr.dest){
                        int dist = Math.abs(houses[curr.dest][0] - houses[i][0]) +
                               Math.abs(houses[curr.dest][1] - houses[i][1]);
                        pq.add(new Edge(i,dist));
                    }
                }
            }
        }
        
        return finalcost;
    }
}
