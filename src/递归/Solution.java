package 递归;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 19:04 2020/10/11
 */
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        //既然没办法阻止alice取的最多，那就尽量剥削bob
        int l=piles.length;
        int j=0;
        int ans=0;
        for(int i=l-2;i>=0&&j<l/3;i-=2){
            ans+=piles[i];
            j++;
        }
        return ans;
    }
    public int minDistance(String a, String b)
    {
        int[][] matrix= new int[b.length()+1][a.length()+1];

        for(int i=0;i<a.length()+1;i++)
        {matrix[0][i]=i;}
        for(int i=0;i<b.length()+1;i++)
        {matrix[i][0]=i;}

        for(int i=1;i<a.length()+1;i++)
        {
            for(int j=1;j<b.length()+1;j++)
            {
                if(a.charAt(i-1) == b.charAt(j-1))
                {matrix[j][i]= matrix[j-1][i-1];}
                else
                {
                    int min= Math.min(
                            Math.min(matrix[j-1][i], matrix[j][i-1]),
                            matrix[j-1][i-1]);
                    matrix[j][i]= min+1;
                }
            }
        }
        return matrix[b.length()][a.length()];
    }
    public int getSqrt(int num) {
        if(num == 1)
            return 1;
        double t = num;
        double x0 = num;
        x0 = x0/2 + t/(2*x0);
        while(x0*x0 - t > 0.000001)
        {
            x0 = x0/2 + t/(2*x0);
        }
        return (int)x0;
    }
}
