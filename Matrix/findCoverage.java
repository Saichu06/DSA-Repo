public class findCoverage {
    public int findCoverage(int[][] mat) {
        int coverages = 0;
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    
                    //left search
                    for(int k=j-1;k>=0;k--){
                        if(mat[i][k]==1){
                            coverages++;
                            break;
                        }
                    }
                    
                    //right 
                    for(int k=j+1;k<m;k++){
                        if(mat[i][k]==1){
                            coverages++;
                            break;
                        }
                    }
                    
                    //below
                    for(int k=i+1;k<n;k++){
                        if(mat[k][j]==1){
                            coverages++;
                            break;
                        }
                    }
                    
                    //up
                    
                    for(int k=i-1;k>=0;k--){
                        if(mat[k][j]==1){
                            coverages++;
                            break;
                        }
                    }
                }
            }
        }
        
        return coverages;
}
