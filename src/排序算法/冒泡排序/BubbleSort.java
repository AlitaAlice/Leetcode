package 排序算法.冒泡排序;

import java.util.Arrays;

/**
 * Title:
 * Description:
 * 冒泡排序  O(n^2)
 * 数据对象为数组 稳定排序 原地排序
 * 原地(原址、就地)排序是指：基本上不需要额外辅助的的空间，
 * 允许少量额外的辅助变量进行的排序。就是在原来的排序数组中比较和交换的排序。
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 16:32 2020/9/7
 */
public class BubbleSort {
    public static int[] bubblesort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectionSort(int[] arr) {
        //int min;
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {1, 12, 33, 2, 1312, 3214, 22, 14, 111};
        //Arrays.sort(arr);
    //   arr = bubblesort(arr);
        arr = selectionSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
