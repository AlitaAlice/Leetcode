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
//    public static void main(String[] args) {
//        public long (int num, int itemNum)
//        {
//
//        }
//    }
public int minMoves2(int[] nums) {
    Arrays.sort(nums);
    int i = 0,j = nums.length - 1, res = 0;
    while (i < j) {
        res += nums[j--] - nums[i++];
    }
    return res;
}
}
