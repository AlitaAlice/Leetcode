package CVTE;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] chars=str.split(",");
        int[] ints = new int[chars.length];
        for (int i = 0; i <chars.length ; i++) {
            ints[i] = Integer.valueOf(chars[i]);
        }
        System.out.println(sumTopN(ints));
    }


    public static int comp(int a, int b) {
        //if (a == b)
          //  System.out.println("a==b");
        return a >= b ? a : b;
    }

    public static int sumTopN(int[] arr) {
        if (arr.length == 0)
            return -1;
        if (arr.length == 1)
            return arr[0];
        if (arr.length == 2)
            return comp(arr[0], arr[1]);
        int a = arr[0];
        int b = comp(arr[0], arr[1]);
        int c = 0;
        for (int i = 2; i < arr.length; i++) {
            c = comp(a + arr[i], b);
            a = b;
            b = c;
        }
        //System.out.println("c= " + c);
        return c;
    }

}
