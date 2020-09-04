package bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 19:49 2020/8/29
 */
public class Soulution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        {25, 84, 21, 47, 15, 27, 68, 35, 20}
//        9
//        25 84 21 47 15 27 68 35 20
//        9
//        25,84,21,47,15,27,68,35,20
        int length = scanner.nextInt();
        String[] array1 = new String[length];
        String str1 = scanner.next();
       array1= str1.split(",");
        Integer array[] = new Integer[length];
        for (int i = 0; i <length ; i++) {
            array[i] = Integer.valueOf(array1[i]);
        }
        quickSort(array);
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println(array[i]);
//        }
        List<Integer> strings = new ArrayList<>();
        strings = Arrays.asList(array);
        String str = strings.toString();
        str=str.replace("[","");
        str=str.replace("]","");
        str=str.replace(" ","");
        System.out.println(str);
    }
    public static void quickSort(Integer[] array)
    {
        int len;
        if (array == null || (len = array.length) == 0 || len == 1) {
            return;
        }
        sort(array, 0, len - 1);
    }

    public static void sort(Integer[] array, int left, int right) {
        if(left>right)
        {
            return;
        }
        int base = array[left];
        int i = left,j = right;
        while (i != j) {
            while (array[j] >= base && i < j) {
                j--;
            }
            while (array[i] <= base && i < j) {
                i++;
            }
            if (i < j) {

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[i];
        array[i] = base;
        sort(array, left, i - 1);
        sort(array,i+1,right);
    }


}
