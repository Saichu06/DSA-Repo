class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq=new int[102];
        for(int c:nums){
            freq[c]++;
        }

        //storing the numbers less than the curr num in the freq array itself
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }

        //storing the results
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                result[i]=0;
            }
            else{
                result[i]=freq[nums[i]-1];
            }
        }

        return result;
    }
}