package hot100;

public class code461 {
    /**
     * @description: 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
     * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。

     * 示例 1：
     * 输入：x = 1, y = 4
     * 输出：2
     * 解释：
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     *        ↑   ↑
     * 上面的箭头指出了对应二进制位不同的位置。

     * 示例 2：
     * 输入：x = 3, y = 1
     * 输出：1
     * @author: hong
     * @date: 2025/4/18 20:46
     * @version: 1.0
     */

    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int result = 0;
        while (a != 0) {
            if(a % 2 != 0){
                result++;
            }
            a = a >> 1;
        }
        return result;
    }
}
