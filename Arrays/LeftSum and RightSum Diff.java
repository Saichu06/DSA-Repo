class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum = sum - leftSum - nums[i];
            int diff = Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
            nums[i]=diff;
        }

        return nums;
    }
}