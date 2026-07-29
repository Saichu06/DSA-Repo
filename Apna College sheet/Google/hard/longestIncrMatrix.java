import java.util.*;
class longestIncrMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return 0;
        } 

        int row = matrix.length;
        int col = matrix[0].length;
        
        if(row==1 && col==1){
            return 1;
        }

        int max=1;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                max= Math.max(max , bfs(matrix , i , j ));
            }
        }

        return max;
    }


    public int bfs(int[][] matrix , int x , int y){

        int[][] dirs = {
            {-1,0},{1,0},{0,-1},{0,1}
        };

        int ans=0;
        int row=matrix.length;
        int col=matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});

        while(!queue.isEmpty()){
            int size = queue.size();
            ans++;

            for(int i=0;i<size;i++){
                int[] currPos = queue.poll();

                for(int[] dir : dirs){
                    int nextX = currPos[0] + dir[0];
                    int nextY = currPos[1] + dir[1];

                    if(nextX<0 || nextX>=row || nextY<0 || nextY>=col){
                        continue;
                    }

                    if(matrix[nextX][nextY] <= matrix[currPos[0]][currPos[1]]){
                        continue;
                    }

                    queue.offer(new int[]{nextX,nextY});
                }
            }
        }

        return ans;

    }
}