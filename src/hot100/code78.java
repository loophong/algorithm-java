package hot100;

import java.util.*;
import java.util.stream.Collectors;

public class code78 {

    public static void main(String[] args) {
        List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backtracking(nums, result, path, 0);
        return result;
    }


    public static void backtracking(int[] nums, List<List<Integer>> result, LinkedList<Integer> path, int startIndex) {
        result.add(new ArrayList<>(path));

        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);

            backtracking(nums, result, path, ++startIndex);

            path.removeLast();
        }
    }


}
