package GFG.Oracle;

public class maxConsecutivebits {
    public int maxConsecBits(int[] arr) {
        // code here
        int count1=0;
        int count0=0;
        int maxCount1=0;
        int maxCount0=0;
        for(int num :arr){
            if(num==1){
                count1++;
                count0=0;
            }else{
                count0++;
                count1=0;
            }
            
            maxCount0 = Math.max(maxCount0,count0);
            maxCount1 = Math.max(maxCount1,count1);
        }
        return Math.max(maxCount0,maxCount1);
    }
}
