package 笔试;

import java.util.Scanner;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 15:47 2020/10/1
 */
public class Compute {
//    public static int[] StringToInt(String[] arrs){
//
//        int[] ints = new int[arrs.length];
//
//        for(int i=0;i<arrs.length;i++){
//
//            ints[i] = Integer.parseInt(arrs[i]);
//
//        }
//
//        return ints;
//
//    }
    public static double[] StringToDouble(String[] arrs){

        double[] doubles = new double[arrs.length-2];

        for(int i=0;i<arrs.length-2;i++){

            doubles[i] = Double.parseDouble(arrs[i]);

        }

        return doubles;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings=str.split(" ");
       // int[] input = StringToInt(strings);
            double[] doubles = StringToDouble(strings);
            System.out.println(doubles.toString());



    }

//    public void count(double[] arr) {
//        double a = arr[0];
//        double b = arr[1];
//            if(arr[])
//    }
}
