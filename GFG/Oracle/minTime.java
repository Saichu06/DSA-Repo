package GFG.Oracle;

public class minTime {
    public int minTime(int n, int s1, int s2) {

        int low = 0;
        int high = Math.min(s1, s2) * n;

        while(low < high){

            int mid = low + (high - low) / 2;

            int currTime1 = mid / s1;
            int currTime2 = mid / s2;

            if(currTime1 + currTime2 < n){

                // Not enough documents can be scanned
                low = mid + 1;

            }else{

                // Enough documents can be scanned,
                // so try to find an even smaller time
                high = mid;
            }
        }

        return low;
    }
}
