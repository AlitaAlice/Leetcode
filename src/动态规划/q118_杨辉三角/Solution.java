package 动态规划.q118_杨辉三角;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {


        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());

        /**
         *   第1行 添加1
         */
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum <numRows ; rowNum++) {

            List<Integer> row = new ArrayList<>();

            /**
             * 获得上一行List
             */
            List<Integer> prevRow = triangle.get(rowNum - 1);

            /**
             * 开头+1
             */
            row.add(1);

            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            /**
             * 结尾+1
             */
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(generate(num).toString());
    }
}