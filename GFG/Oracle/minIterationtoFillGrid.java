package GFG.Oracle;

public class minIterationtoFillGrid {
    public int minIteration(int n, int m, int x, int y) {

         // Top-left (1,1)
         int d1 = Math.abs(x - 1) + Math.abs(y - 1);

         // Top-right (1,m)
         int d2 = Math.abs(x - 1) + Math.abs(y - m);

         // Bottom-left (n,1)
         int d3 = Math.abs(x - n) + Math.abs(y - 1);

         // Bottom-right (n,m)
         int d4 = Math.abs(x - n) + Math.abs(y - m);

         int max1 = Math.max(d1, d2);
         int max2 = Math.max(d3, d4);

         return Math.max(max1, max2);
     }
}
