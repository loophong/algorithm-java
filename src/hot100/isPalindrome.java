package hot100;

import java.util.ArrayList;

public class isPalindrome {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 5, 7, 5, 3, 8, 9, 0, 6, 5, 9, 6, 9, 2, 1, 3, 0, 8, 8, 4, 8, 9, 0, 3, 5, 6, 8, 9, 0, 1, 3, 2, 1, 0, 9, 8, 6, 5, 3, 0, 9, 8, 4, 8, 8, 0, 3, 1, 2, 9, 6, 9, 5, 6, 0, 9, 8, 3, 5, 7, 5, 1, 2, 2, 1};
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
            integers.add(nums[i]);
        }

        System.out.println(integers);


        int length = integers.size();
        System.out.println("当前length" + length);
        for (int i = 0, tmp = length; i <= length / 2; i++) {
            Integer a = integers.get(i);
            Integer b = integers.get(--tmp);
            System.out.println("当前循环次数" + i);
            if (a != b) {
                System.out.println(false);
            }
        }

    }
}
