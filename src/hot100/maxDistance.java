package hot100;

import java.util.ArrayList;
import java.util.List;

public class maxDistance {
    public static void main(String[] args) {


        List<List<Integer>> arrays = new ArrayList<>();
        arrays.add(new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }});
        arrays.add(new ArrayList<Integer>() {{
            add(4);
            add(5);
        }});
        arrays.add(new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }});
        System.out.println(arrays);

        // 从前两个数组中选取最小值和最大值

        int  min1 = arrays.get(0).get(0);
        int  min2 = arrays.get(1).get(0);
        int  max1 = arrays.get(0).get(arrays.get(0).size() -1);
        int  max2 = arrays.get(1).get(arrays.get(1).size() -1);
        int value1 = min1 - max2 > 0 ? min1 - max2 : max2 - min1;
        int value2 = min2 - max1 > 0 ? min2 - max1 : max1 - min2;
        int min, max;
        if(value1 > value2){
            min = Math.min(min1,max2);
            max = Math.max(min1,max2);
        }else{
            min = Math.min(min2,max1);
            max = Math.max(min2,max1);
        }
        int result = max - min;
        for(int i = 2; i < arrays.size(); i++){
            int v1 = Math.abs(min - arrays.get(i).get(arrays.get(i).size() - 1));
            int v2 = Math.abs(max - arrays.get(i).get(0));
            if(v1 > result){
                max = arrays.get(i).get(arrays.get(i).size() - 1);
                result = v1;
            }
            if(v2 > result){
                min = arrays.get(i).get(0);
                result = v2;
            }
        }
        System.out.println(result);

    }
}
