package 排序相关.选择排序算法;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates
 *
 * @author Alita Alice
 * @version 1.0
 * @Date: Created in 15:56 2020/6/4
 */
public class Solution {
    /**
     *  1111111111111
     */
   static int[] selectsort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input arr[5]");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        selectsort(arr);
        System.out.println("now arr[5] is:");
        System.out.println(Arrays.toString(arr));
    }
}
