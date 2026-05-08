class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxsum=Integer.MIN_VALUE;

        while(left<right){
            int width=right-left;
            int currheight=Math.min(height[left],height[right]);
            int water=currheight*width;
            maxsum=Math.max(maxsum,water);

            if(height[left]<height[right]) left++;
            else right--;
        }

        return maxsum;
    }
}