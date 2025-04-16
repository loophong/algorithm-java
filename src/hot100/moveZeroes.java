package hot100;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        int pre = 0;
        for (int post = 1; post < nums.length; post++) {
            if(nums[pre] != 0){
                pre++;
            }else if (nums[pre] == 0 && nums[post] != 0) {
                int tmp = nums[pre];
                nums[pre] = nums[post];
                nums[post] = tmp;
                pre++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
