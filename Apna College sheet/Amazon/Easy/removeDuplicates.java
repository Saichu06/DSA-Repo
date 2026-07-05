public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int currNum = 0;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
            } else {
                nums[++left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }
}
