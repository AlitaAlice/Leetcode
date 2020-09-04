package bishi;
import java.util.Arrays;

/**
 * 问题：顺时针螺旋输出数组
 * 题目特征：保持一种模式前进，遇到一定条件转换另一种模式前进
 * 思路：用一个二维数组来不同取值来控制前进，设置变动的边界为改变的条件
 */
public class test4 {

    public int longestOnes(int[] A, int K) {
        //cnt记录当前0的数量
        int left=0,right=0,res=0,cnt=0;
        while(right<A.length){
            if(A[right]==0)
                cnt++;
            //当0的数量超出要求时，移动左边界直至0的数量满足要求
            while(cnt>K){
                if(A[left++]==0)
                    cnt--;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}

