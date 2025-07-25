package hot100;

public class code283 {
    /**
     * @description: hot100-code283
     * 解题思路：双指针
     * @author: hong
     * @date: 2025/7/25 9:46
     * @version: 1.0
     */
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1)
            return;
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != 0) {
                left++;
            } else if (nums[left] == 0 && nums[right] != 0) {
                int temp = nums[left];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
