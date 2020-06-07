package 排序相关.插入排序算法;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates
 *
 * @author Alita Alice
 * @version 1.0
 * @Date: Created in 16:08 2020/6/4
 */
public class Solution {
    static int[] insertsort(int arr[])
    {
     for(int i=1;i<arr.length;i++)
     {
         int j = i;
         int temp = arr[i];
         while (j>0&&arr[j-1]>temp)
         {
             arr[j] = arr[j-1];
             j--;
         }
         if(j!=i)
         {
             arr[j] = temp;
         }
     }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("sort arr is");
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
