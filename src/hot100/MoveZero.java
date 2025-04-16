package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class MoveZero {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     */

//    public static void main(String[] args) {
//
//        int[] nums = {0, 1, 0, 3, 12};
//
//        //根据数组位置，进行重新排序
//        int tmp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[i - tmp] = nums[i];
//            } else {
//                tmp++;
//            }
//        }
//        // 根据0的个数，进行补充
//        for (int i = 0; i < tmp; i++) {
//            nums[nums.length - i - 1] = 0;
//        }
//
//        System.out.println(Arrays.toString(nums));
//
//    }


    /**
     * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
     * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
     */
//    public static void main(String[] args) {
//        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
//        int[][] result = new int[intervals.length][];
//        int size = 0;
//        for (int i = 0; i < intervals.length - 1; i++) {
//            int j = i + 1;
//            if (intervals[i][1] >= intervals[j][0]) {
//                intervals[i][1] = intervals[j][1];
//                result[size++] = intervals[i++];
//            } else {
//                result[size++] = intervals[i];
//            }
//        }
//
//        System.out.println(Arrays.deepToString(result));
//        
//    }
    
    /**
     * @description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * @author: hong
     * @date: 2025/1/7 14:41
     * @version: 1.0
     */
//    public static void main(String[] args) {
//        String s = "([])";
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (stack.isEmpty()){
//                stack.push(s.charAt(i));
//                continue;
//            }
//            Character peek = stack.peek();
//            if(peek == '{' && s.charAt(i) == '}'){
//                stack.pop();
//            }else if(peek == '(' && s.charAt(i) == ')'){
//                stack.pop();
//            }else if(peek == '[' && s.charAt(i) == ']'){
//                stack.pop();
//            }else {
//                stack.push(s.charAt(i));
//            }
//        }
//
//        System.out.println(stack);
//    }
    public static void main(String[] args) {
        String s = "([])";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            Character peek = stack.peek();
            System.out.println(peek);
//            if(peek - s.charAt(i) == -1){
//                stack.pop();
//            }else {
//                stack.push(s.charAt(i));
//            }
        }

        System.out.println(stack);
    }

}
