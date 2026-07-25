import java.util.*;

class wordSearch {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0) && searchWord(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchWord(int row,int col , int index,char[][] board,
    String word){
        if(index==word.length()){
            return true;
        }

        if(row<0 || row>=board.length || col<0 || col>=board[0].length || word.charAt(index)
        !=board[row][col] || visited[row][col]){
            return false;
        }

        visited[row][col]=true;

        if(searchWord(row+1,col,index+1,board,word)||
        searchWord(row,col+1,index+1,board,word)||
        searchWord(row-1,col,index+1,board,word)||
        searchWord(row,col-1,index+1,board,word)){
            return true;
        }

        visited[row][col]=false;
        return false;
    }
}