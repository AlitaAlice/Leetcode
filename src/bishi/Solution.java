package bishi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 23:33 2020/8/24
 */
public class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode rs = new ListNode(l1.val + l2.val);
//
//
//    }
//public static void main(String[] args) {
//    int[][] values = {
//            {2, 3, 1},
//            {1, 5, 1},
//            {4,2,1}
//    };
//    System.out.println(getMaxPathValue(values));
//
//}

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if(num%i==0)
            {
                list.add(i);
                num = num / i;
                i = 1;
            }
        }
        if (list.size() == 1) {
            System.out.print(1 + "*" + a);
            return;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + "*");
        }
        System.out.println(list.get(list.size()-1));
    }

}
