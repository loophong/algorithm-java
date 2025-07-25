package hot100;

public class code11 {
    /**
     * @description: hot100-code11 盛最多水的容器
     * 解题思路：双指针
     * @author: hong
     * @date: 2025/7/25 10:00
     * @version: 1.0
     */
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int cur = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, cur);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return result;
    }
}
