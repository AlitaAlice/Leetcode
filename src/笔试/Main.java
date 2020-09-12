package 笔试;

import java.util.Scanner;


public class Main {
    public static int binaryTodecimal2(String n) {
      String res=  Integer.valueOf(n,2).toString();
      int in = Integer.parseInt(res);
        return in;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int source = binaryTodecimal2(str);
        //int source = scanner.nextInt();
        double target = Math.pow(source, 0.25);
        if ((int)target==target)
        {
            System.out.println((int)target);
        }
        else
        {
            System.out.println((int)target+1);
        }
      //  System.out.println(target);
    }
}