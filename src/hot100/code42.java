package hot100;

import java.util.Arrays;

public class code42 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int max = trap(arr);
        System.out.println(max);
    }

    /**
     * @description: hot100 - code42 接雨水
     * 解题思路：先逐个找到当前位置能接的雨水数量，然后相加
     * @author: hong
     * @date: 2025/7/25 10:37
     * @version: 1.0
     */
    public static int trap(int[] height) {
        int result = 0;
        int length = height.length;
        int[] leftMaxHeight = new int[length];
        int[] rightMaxHeight = new int[length];
        int tempMax = 0;
        for (int i = 0; i < length; i++) {
            tempMax = Math.max(height[i], tempMax);
            leftMaxHeight[i] = tempMax;
        }
        tempMax = 0;
        for (int i = length - 1; i > 0; i--) {
            tempMax = Math.max(height[i], tempMax);
            rightMaxHeight[i] = tempMax;
        }
        for (int i = 0; i < length; i++) {
            result += Math.max(Math.min(leftMaxHeight[i], rightMaxHeight[i]) - height[i], 0);
        }
        return result;
    }


    /**
     * @description: 以下解法，优化了找到左右最大高度，但是效率不好
     * @author: hong
     * @date: 2025/7/25 10:48
     * @version: 1.0
     */
    public int trap2(int[] height) {
        int[] capacity = new int[height.length];
        capacity[0] = 0;
        capacity[height.length - 1] = 0;
        int leftMaxHeight = height[0];
        int rightMaxHeight = findMaxHeight2(height, 2, height.length - 1);
        for (int i = 1; i < capacity.length - 1; i++) {
            leftMaxHeight = Math.max(leftMaxHeight, height[i]);
            if (rightMaxHeight == height[i]) {
                rightMaxHeight = findMaxHeight2(height, i + 1, height.length - 1);
            }
            capacity[i] = Math.max(Math.min(leftMaxHeight, rightMaxHeight) - height[i], 0);
        }
        int result = 0;
        for (int i = 0; i < capacity.length; i++) {
            result += capacity[i];
        }
        return result;
    }

    public int findMaxHeight2(int[] height, int left, int right) {
        int max = height[left];
        for (int i = left + 1; i <= right; i++) {
            max = Math.max(max, height[i]);
        }
        return max;
    }


    /**
     * @description: 以下写法，case322，无数个1，超时
     * @author: hong
     * @date: 2025/7/25 10:38
     * @version: 1.0
     */
    public int trap1(int[] height) {
        int[] capacity = new int[height.length];
        capacity[0] = 0;
        capacity[height.length - 1] = 0;
        for (int i = 1; i < capacity.length - 1; i++) {
            int leftMaxHeight = findMaxHeight1(height, 0, i - 1);
            int rightMaxHeight = findMaxHeight1(height, i + 1, height.length - 1);
            capacity[i] = Math.max(Math.min(leftMaxHeight, rightMaxHeight) - height[i], 0);
        }
        int result = 0;
        for (int i = 0; i < capacity.length; i++) {
            result += capacity[i];
        }
        return result;
    }

    public int findMaxHeight1(int[] height, int left, int right) {
        int max = height[left];
        for (int i = left + 1; i <= right; i++) {
            max = Math.max(max, height[i]);
        }
        return max;
    }
}
