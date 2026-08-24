package GFG.Oracle;

import java.util.ArrayList;

public class spiralMatrix {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int startrow=0;
        int startcol=0;
        int endrow=mat.length-1;
        int endcol=mat[0].length-1;

        ArrayList<Integer> list=new ArrayList<>();

        while(startrow<=endrow && startcol<=endcol){

            //top
            for(int i=startcol;i<=endcol;i++){
                list.add(mat[startrow][i]);
            }

            //right
            for(int i=startrow+1;i<=endrow;i++){
                list.add(mat[i][endcol]);
            }

            //bottom
            if(startrow<endrow){
                for(int i=endcol-1;i>=startcol;i--){
                    list.add(mat[endrow][i]);
                }
            }


            //left
            if(startcol<endcol){
                for(int i=endrow-1;i>startrow;i--){
                    list.add(mat[i][startcol]);
                }
            }


            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

        return list;
    }
}
