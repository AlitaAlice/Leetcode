package 动态规划.q70_爬楼梯;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 21:20 2020/9/9
 */
class Solution {
    // 后缀数组法
        public static String longestDupSubstring(String S) {
            int len = S.length();
            String result = "";
            int maxLen = 0;
            if(len <= 1)
                return "";
            String[] strs = new String[len];  // 存放S的后缀字符串
            for(int i = 0; i < len; i++){
                strs[i] = S.substring(i, len);
            }
            Arrays.sort(strs);  // 进行排序
            for(int i = 0; i < len-1; i++){  // 两个相邻字符串的最长公共前缀
                int tmp = lenTwoStr(strs[i], strs[i+1]);
                if(tmp > maxLen){
                    maxLen = tmp;
                    result = strs[i].substring(0,maxLen);
                }
            }
            return result;
        }
        // 两个后缀子串的前缀最长公共子串
        public static int lenTwoStr(String str1, String str2){
            if(str1.length() == 0 || str2.length() == 0)
                return 0;
            int i = 0;
            while(i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i))
                i ++;
            return i;
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(longestDupSubstring(str));

    }

/*    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n==1)
        {
            return 1;
        }
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <n+1 ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
          int sum=20;
          int n=3;
          while (n>>1<9)
          {
              sum=sum-n;
              n++;
          }
        System.out.println(n);
        System.out.println(sum);
    }*/
}