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
    }


    public long sum(int num, int itemNum) {
        long sum = 0, pre = 0;
        //  Scanner sc = new Scanner(System.in);
        //     System.out.println("请输入项数：");
        //  n = sc.nextInt();
        //System.out.println("请输入数值：");
        // a = sc.nextInt();
        for (long i = 1; i <= num; i++) {

            pre += itemNum;
            sum += pre;
            itemNum *= 10;
        }
        return sum;
    }
}
