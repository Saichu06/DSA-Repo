class Solution {
    public int lowerbound(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int pos=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
                pos=mid;
            }
            else{
                left=mid+1;
            }
        }

        return pos;
    }

    public int upperbound(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int pos=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
                pos=mid;
            }
            else{
                left=mid+1;
            }
        }

        return pos;
    }
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};

        int lb=lowerbound(nums,target);

        if(lb==-1 || nums[lb]!=target){
            return new int[]{-1,-1};
        }

        int up=upperbound(nums,target);

        int last=(up==-1)?nums.length-1:up-1;

        int[] ans={lb,last};

        return ans;         
    }
}