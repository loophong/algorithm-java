import java.util.ArrayList;
import java.util.Arrays;

public class mergeTwoOrderedArrays {
    /**
     * @description: 合并两个有序数组
     * @author: hong
     * @date: 2025/4/21 20:45
     * @version: 1.0
     */
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 4, 4, 6};
        int[] arr2 = {1, 2, 3, 3, 5};
        int[] result = new int[arr1.length + arr2.length];

        int length = 0;
        int i = 0, j = 0;

        while (i < arr1.length || j < arr2.length) {
            if (i < arr1.length && j < arr2.length) {
                int var = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
                length = addVal(result, length, var);
            } else if (i >= arr1.length) {
                length = addVal(result, length, arr2[j++]);
            } else if (j >= arr2.length) {
                length = addVal(result, length, arr1[i++]);
            }
        }
        System.out.println(Arrays.toString(result));

        int[] ints = Arrays.copyOf(result, length);
        System.out.println(Arrays.toString(ints));
    }


    private static int addVal(int[] arr, int arrLength, int val) {
        if (arrLength == 0) {
            arr[arrLength] = val;
            return arrLength + 1;
        } else if (arr[arrLength - 1] != val) {
            arr[arrLength] = val;
            return arrLength + 1;
        }
        return arrLength;
    }


}
