package 笔试;

import java.util.Scanner;


public class Main {
    public static long binaryTodecimal2(String n) {
      String res=  Integer.valueOf(n,2).toString();
      //BigInteger in = new BigInteger(res);
        long in = Long.parseLong(n);
        return in;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        if (ss >= 0 && ss < Math.pow(2, 100)) {
        long source = binaryTodecimal2(str);
            //int source = scanner.nextInt();
            double target = Math.pow(source, 0.25);
            if ((long) target == target) {
                System.out.println((long) target);
            } else {
                System.out.println((long) target + 1);
            }
//        } else {
//            return;
//        }
    }
}