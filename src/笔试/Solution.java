package 笔试;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 10:16 2020/9/26
 */
public class Solution {


    public static void printChars(int total, int step) {

        int now = 1;
        int sumNow = 1;
        int n = 0;
        while (sumNow < total) {
            for (int i = 0; i < now; i++) {
                System.out.print("*");
            }
            System.out.println("\r");
            now += step;
            sumNow += now;
             n = now;
        }
        int leftover = sumNow - total;
        int left = n - leftover;
        for (int i = 0; i < left; i++) {
            System.out.print("*");

        }
        if (leftover > 0) {
            for (int i = 0; i < leftover; i++) {
                System.out.print("?");
            }
            System.out.println("\r");
        }
        }

    public static void main(String[] args) {
        printChars(18, 2);
    }

    }

