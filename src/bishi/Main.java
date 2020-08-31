package bishi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = null;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        String[] ints=str.split(",");
//        Integer array[] = new Integer[length];
//        for (int i = 0; i <length ; i++) {
//            array[i] = Integer.valueOf(array1[i]);
//        }

        int[][] values = {
                {2, 3, 1},
                {1, 5, 1},
                {4,2,1}
        };
        System.out.println(getMaxPathValue(values));
    }
    private static int getMaxPathValue(int[][] values) {
        if(values==null)
        {
            return 0;
        }
        int rows = values.length;
        if (rows <= 0) {
            return 0;
        }
        int cols = values[0].length;
        if (cols <= 0) {
            return 0;
        }
        int[][] maxValues = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int left = 0;
                int up = 0;
                if (i > 0) {
                    up = maxValues[i - 1][j];
                }
                if (j > 0) {
                    left = maxValues[i][j - 1];
                }
                maxValues[i][j] = Math.max(up, left) + values[i][j];
            }
        }
        return maxValues[rows - 1][cols - 1];
    }
}