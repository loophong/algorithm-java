package hot100;

public class largestRectangleArea84 {
    public static void main(String[] args) {
        int[] heights = {2, 4};
        violentSolutions(heights);
    }

    static void violentSolutions(int[] heights) {
        int maxArea = 0;
        int curArea = 0;
        if (heights.length == 1) {
            maxArea = heights[0];
        } else if (heights.length > 1) {
            for (int i = 0; i < heights.length - 1; i++) {
                int h1 = heights[i];
                int h2 = heights[i + 1];
                int max = Math.max(h1, h2);
                int min = Math.min(h1, h2);
                curArea = Math.max(max, min * 2);
                if (curArea > maxArea)
                    maxArea = curArea;
            }
        }

        System.out.println(maxArea);
    }

}
