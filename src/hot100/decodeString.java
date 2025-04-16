package hot100;

import java.util.Stack;

public class decodeString {
    public static void main(String[] args) {

        String s = "100[leetcode]";

        String result = "";
        Stack<Integer> op = new Stack<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                String operate = String.valueOf(c);
                // 顺着字符串继续寻找
                while (true) {
                    c = s.charAt(++i);
                    if (c >= '0' && c <= '9') {
                        operate = operate + c;
                    }else{
                        i--;
                        break;
                    }
                }
                op.push(Integer.valueOf(operate));

            } else if (c == '[') {
                stack.push(c);
            } else if (c == ']') {
                // 从栈中取出元素
                String tmp = "";
                while (true) {
                    char pop = stack.pop();
                    if (pop == '[') {
                        break;
                    }
                    tmp = pop + tmp;
                }
                int pop = op.pop();
                String newStr = "";
                for (int k = 0; k < pop; k++) {
                    newStr += tmp;
                }
                // 将拼接后的元素入栈
                for (int m = 0; m < newStr.length(); m++) {
                    stack.push(newStr.charAt(m));
                }
            } else {
                stack.push(c);
            }
        }

        // 将栈中元素逆序组成result
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        System.out.println(result);


    }
}
