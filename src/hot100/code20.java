package hot100;

import java.util.Stack;

public class code20 {

    /**
     * @description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * 有效字符串需满足：
     * 1、左括号必须用相同类型的右括号闭合。
     * 2、 左括号必须以正确的顺序闭合。
     * 3、 每个右括号都有一个对应的相同类型的左括号。
     * @author: hong
     * @date: 2025/4/17 13:46
     * @version: 1.0
     */

    public static void main(String[] args) {
        String s = "()[]{}";
        boolean b = isValid(s);
        System.out.println(b);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                Character peek = stack.peek();
                if (s.charAt(i) - peek == 1 || s.charAt(i) - peek == 2) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
}
