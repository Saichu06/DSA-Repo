public class Main {
    public static void main(String[] args) {
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==7) c++;
            }
        }

        int 2ndrowsum=0;
        for(int i=0;i<m;i++){
            2ndrowsum+=matrix[2][i];
        }

        int n=matrix.length;
        int m=matrix[0].length;
        int[][] transpose=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;

        

    }
}