package hot100.Hash;

import java.util.*;
import java.util.stream.Collectors;

public class longestConsecutive128 {
    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     * <p>
     * 示例 1：
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     * <p>
     * 示例 2：
     * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
     * 输出：9
     * <p>
     * 示例 3：
     * 输入：nums = [1,0,1,2]
     * 输出：3
     */

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        HashMap<Integer, Object> hashMap = new HashMap<>();
//        Arrays.stream(nums).sorted().collect()
        int maxSize = 0;
//        int maxVal
        int tmpSize = 0;

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],null);
        }
        Set<Integer> keySet = hashMap.keySet();

        System.out.println(keySet);

    }

}
