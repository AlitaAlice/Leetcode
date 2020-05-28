package 整数反转;

/**
 * This program demonstrates
 *
 * @author Alita Alice
 * @version 1.0
 * @Date: Created in 21:20 2020/5/20
 */
public class Solution {
    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}
