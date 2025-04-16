package hot100;

public class productExceptSelf {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int result = 1;

        for (int num : nums) {
            result = result * num;
        }
        System.out.println(result);



    }
}
