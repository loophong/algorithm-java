package hot100;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] newNums = new int[nums.length];

        int length = nums.length;

        for (int i = 0; i < nums.length; i++) {
            newNums[(i + k) % length] = nums[i];
        }
        System.out.println(Arrays.toString(newNums));
        nums = newNums;
        System.out.println(Arrays.toString(nums));
        System.arraycopy(newNums, 0, nums, 0, nums.length);

    }
}
