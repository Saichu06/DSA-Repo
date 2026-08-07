
public class arrangingCoins {
     public int arrangeCoins(int n) {

        int row = 1;
        int count = 0;

        while(n >= row){
            n -= row;
            count++;
            row++;
        }

        return count;
    }
}
