package 排序算法.冒泡排序;

import java.util.Arrays;
import java.util.Scanner;

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
    public static int[] sort(int[] sourceArray) {

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings=str.split(" ");
        int[] arr = StringToInt(strings);
        arr = sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] StringToInt(String[] arrs){

        int[] ints = new int[arrs.length];

        for(int i=0;i<arrs.length;i++){

            ints[i] = Integer.parseInt(arrs[i]);

        }

        return ints;

    }
}
