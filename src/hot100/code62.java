package hot100;

/**
 * @description: hot100 - 62 题 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 * @author: hong
 * @date: 2025/5/31 18:35
 * @version: 1.0
 */
public class code62 {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }
    public static int uniquePaths(int m, int n) {
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++)
            res[i][0] = 1;
        for (int i = 0; i < n; i++)
            res[0][i] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                res[i][j] = res[i - 1][j] + res[i][j - 1];
            }
        }
        return res[m-1][n-1];
    }
}
