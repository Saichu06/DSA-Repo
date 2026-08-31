public class minDeletions {
    public int minimumDeletions(int[] nums) {
        int maxfc=0;
        int minfc=0;
        int maxbc=0;
        int minbc=0;
        int n=nums.length;
        int maxNum=Integer.MIN_VALUE;
        int minNum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxNum){
                maxNum=nums[i];
                maxfc=i+1;
                maxbc=n-i;
            }
            if(nums[i]<minNum){
                minNum=nums[i];
                minfc=i+1;
                minbc=n-i;
            }
        }

        int c1 = Math.max(maxfc, minfc);
        int c2 = maxfc+minbc;
        int c3 = maxbc+minfc;
        int c4 = Math.max(maxbc, minbc);

        return Math.min(c1,Math.min(c2,Math.min(c3,c4)));
    }
}
