package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class code46 {
    public static void main(String[] args) {
        List<List<Integer>> permute = permute(new int[]{1, 2, 3});

        System.out.println(permute);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();

        backtracking(result, path, nums);
        return result;
    }

    static void backtracking(List<List<Integer>> result, LinkedList<Integer> path, int[] nums) {
        if (path.size() == nums.length) {
            result.add((List<Integer>) path.clone());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MIN_VALUE) {
                path.add(nums[i]);
                nums[i] = Integer.MIN_VALUE;

                backtracking(result, path, nums);

                nums[i] = path.getLast();
                path.removeLast();
            }
        }
    }
}
