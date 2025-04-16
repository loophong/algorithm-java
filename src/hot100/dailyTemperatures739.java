package hot100;

import java.util.Arrays;

public class dailyTemperatures739 {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        violentSolutions(temperatures);

    }


    static void violentSolutions(int[] temperatures) {
        for (int i = 0; i < temperatures.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    flag = true;
                    temperatures[i] = j - i;
                    break;
                }
            }
            if(!flag){
                temperatures[i] = 0;
            }
        }
        System.out.println(Arrays.toString(temperatures));
    }
}
