package hot100;

public class maxArea {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int max = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            max = Math.max(max, Math.min(nums[i], nums[j]) * (j - i));
            if (nums[i] < nums[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(max);
    }
}
