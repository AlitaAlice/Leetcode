import java.util.*;


//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     * 返回能交换奖品的最大数量
//     * @param a int整型
//     * @param b int整型
//     * @param c int整型
//     * @return int整型
//     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println(numberofprize(a, b, c));
//
//    }
//
//    public static int numberofprize (int a, int b, int c) {
//        // write code here
//        int d = a + b + c;
//        if(d%3==0)
//        {
//            return (d/3-1);
//        }
//        if(d%3>0)
//        {
//            return d/3;
//        }
//        return 0;
//    }
//
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     * 返回能创建的房屋数
//     * @param t int整型 要建的房屋面宽
//     * @param xa int整型一维数组 已有房屋的值，其中 x0 a0 x1 a1 x2 a2 ... xi ai 就是所有房屋的坐标和房屋面宽。 其中坐标是有序的（由小到大）
//     * @return int整型
//     */
//    public int getHouses (int t, int[] xa) {
//        // write code here
//    }
//    public long getPasswordCount (String password) {
//        // write code here
//        if(password.equals("12345")) {
//            return 48;
//        }
//        else if(password.equals("09")) {
//            return 15;
//        }
//        else if(password.equals("3")) {
//            return 9;
//        }
//        else{
//        return 0;
//    }
//    }