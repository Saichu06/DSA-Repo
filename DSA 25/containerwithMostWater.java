public class containerwithMostWater {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int currheight = Math.min(height[left], height[right]);
            int area = width * currheight;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
