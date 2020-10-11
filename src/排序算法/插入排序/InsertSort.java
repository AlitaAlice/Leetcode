package 排序算法.插入排序;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 21:11 2020/10/7
 */
public class InsertSort {
    /**
     * 思路： 依次选择元素进行插入，向前选择合适的位置进行插入，直到遍历到最后一个元素
     * 稳定排序 原地排序
     * O(n^2)
     * @param sourceArray
     * @return
     */
    public static int[] insertSort(int[] sourceArray) {

        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;

            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            
            if (j != i) {
                arr[j] = tmp;
            }
        }
        return arr;
    }

}
