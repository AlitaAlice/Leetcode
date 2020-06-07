package 排序相关.冒泡排序;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates
 *
 * @author Alita Alice
 * @version 1.0
 * @Date: Created in 15:11 2020/6/4
 */
public class Solution {
    static  int[] bubblesort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
         for(int j=0;j<arr.length-1-i;j++)
         {
             if(arr[j]>arr[j+1])
             {
                 int temp=arr[j+1];
                 arr[j+1]=arr[j];
                 arr[j]=temp;
             }
         }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("请输入数组");
        int[] arr=new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        System.out.println("排序后的数组为：");
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
