package 笔试;

import java.util.Arrays;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 15:28 2020/9/11
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
    }

    public  static  long sum(int num, int itemNum) {
        long sum = 0, pre = 0;
        for (long i = 1; i <= itemNum; i++) {
            pre += num;
            sum += pre;
            num *= 10;
        }
        return sum;
    }
}
