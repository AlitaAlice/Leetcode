package 动态规划.q70_爬楼梯;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 21:20 2020/9/9
 */
class Solution {
    public int climbStairs(int n) {
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
    }
}