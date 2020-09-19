package 笔试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Title:
 * Description:输入一个浮点数，请按照三位分节制（金融计数法）打印，
 * 示例：1000.12 => 1,000.12
 * 12345678.51 => 12,345,678.51
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 15:28 2020/9/11
 */
public class Solution {
        public static void main(String[] args) {
          //  System.out.println("请输入一个正整数:");
            Scanner a = new Scanner(System.in);
            int n = a.nextInt();
            for(int k=2;k<=n/2;k++){
                if(n%k==0){
                    System.out.println(k);
                    n= n/k;   //用递归把n重新定值
                    k=2;  //这步很重要，让for循环重新执行
                }
            }
            System.out.println(n);    //把最后一个质因数输出
        }


}
