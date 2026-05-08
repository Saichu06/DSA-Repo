class Solution {
    public int maxArea(int[] height) {
        int maxsum=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<=right){
            int width=right-left;
            int water=Math.min(height[left],height[right]);
            int area=water*width;
            maxsum=Math.max(maxsum,area);

            if(height[left]<height[right]) left++;
            else right--;
        }

        return maxsum;
    }
}