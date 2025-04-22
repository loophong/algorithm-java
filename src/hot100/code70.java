package hot100;

public class code70 {
    public int climbStairs(int n) {
        // 递推公式 第n楼 = 第n-1楼 + 第n-2楼

        if (n <= 2)
            return n;
        int result = 0;
        int a = 1;
        int b = 2;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            if(i % 2 == 0){
                b = result;
            }else{
                a = result;
            }
        }
        return result;
    }
}
