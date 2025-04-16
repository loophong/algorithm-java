package hot100;

import java.util.HashMap;

public class code3 {

    /**
     * @description: code3-没有重复元素的最长字串长度
     * @author: hong
     * @date: 2025/4/16 22:05
     * @version: 1.0
     */
    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int left = 0, right = 0;
        int maxLength = 0;
        while (right < s.length()) {
            if (hash.containsKey(s.charAt(right))) {
                Integer integer = hash.get(s.charAt(right));
                maxLength = Math.max(right - integer, maxLength);
                // 将left与重复元素左边的元素全部移除
                while(left <= integer){
                    hash.remove(s.charAt(left));
                    left++;
                }
                hash.put(s.charAt(right), right++);
            }else{
                hash.put(s.charAt(right), right++);
                maxLength = Math.max(right - left, maxLength);
            }
        }
        return maxLength;
    }
}
