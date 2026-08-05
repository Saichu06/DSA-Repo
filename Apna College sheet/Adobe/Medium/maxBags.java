import java.util.Arrays;

public class maxBags {
     public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] diff =new int[n];

        for(int i=0;i<n;i++){
            diff[i] = capacity[i]-rocks[i];
        }

        Arrays.sort(diff);

        for(int i=0;i<n;i++){
            if(diff[i]<=additionalRocks){
                additionalRocks-=diff[i];
                diff[i]=diff[i]-diff[i];
            }
        }
        int count=0;
        for(int num : diff){
            if(num==0) count++;
        }

        return count;
    }
}
