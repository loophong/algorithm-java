package hot100;
/**
 * @description: hot100  64 题 最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步
 * @author: hong
 * @date: 2025/5/31 18:46
 * @version: 1.0
 */
public class code64 {

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] res = new int[row][col];

        res[0][0] = grid[0][0];
        for(int i = 1; i < row; i++){
            res[i][0] = res[i-1][0] + grid[i][0];
        }
        for(int i = 1; i < col; i++){
            res[0][i] = res[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                res[i][j]= Math.min(res[i-1][j] + grid[i][j],res[i][j-1] + grid[i][j]);
            }
        }

        return res[row-1][col-1];
    }
}
