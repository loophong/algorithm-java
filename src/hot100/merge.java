package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class merge {
    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {0, 3}};

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);



        System.out.println(Arrays.toString(intervals));

        System.out.println(Arrays.deepToString(intervals));
        int pre = 0;
        for (int post = 1; post < intervals.length; post++) {
            if (intervals[pre][1] > intervals[post][0]){
                intervals[pre][1] = intervals[post][1];
                intervals[post] = null;
            }else {
                pre = post;
            }
        }

        ArrayList<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval != null)
                list.add(interval);
        }
        int[][] array = list.toArray(new int[list.size()][]);

        System.out.println(Arrays.deepToString(array));


    }
}
