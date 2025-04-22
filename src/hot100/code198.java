package hot100;

public class code198 {
    /**
     * @description: 打家劫舍
     * 你是一个专业的小偷，计划偷窃沿街的房屋。
     * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
     * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
     * <p>
     * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
     * @author: hong
     * @date: 2025/4/22 17:08
     * @version: 1.0
     */
    public int rob(int[] nums) {
        // 递推公式 maxVal[i] = Math.max(maxVal[i-2]+nums[i],maxVal[i-1]);
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);
        int maxVal = 0;

        for (int i = 2; i < nums.length; i++) {
            if (i % 2 == 0) {
                maxVal = Math.max(a + nums[i], b);
                a = maxVal;
            } else {
                maxVal = Math.max(b + nums[i], a);
                b = maxVal;
            }
        }
        return maxVal;
    }
}
