package 笔试;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
        // 定义36进制数字
    private static String LETTER_DIGIT_REGEX = "^[a-z0-9A-Z]+$";
        private static final String X36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // 拿到36进制转换10进制的值键对
        private static HashMap<Character, Long> thirysixToTen = createMapThirtysixToTen();
        // 拿到10进制转换36进制的值键对
        private static HashMap<Long, Character> tenToThirtysix = createMapTenToThirtysix();
        // 定义静态进制数
        private static long BASE = 36;

        private static HashMap<Character, Long> createMapThirtysixToTen() {
            HashMap<Character, Long> map = new HashMap<Character, Long>();
            for (long i = 0; i < X36.length(); i++) {
                // 0--0,... ..., Z -- 35的对应存放进去
                map.put(X36.charAt((int) i), i);
            }
            return map;
        }

        private static HashMap<Long, Character> createMapTenToThirtysix() {
            HashMap<Long, Character> map = new HashMap<Long, Character>();
            for (long i = 0; i < X36.length(); i++) {
                // 0--0,... ..., 35 -- Z的对应存放进去
                map.put(i, X36.charAt((int) i));
            }
            return map;
        }

        public static boolean isLetterDigit(String str) {
            return str.matches(LETTER_DIGIT_REGEX);
        }
        public static long  ThirtysixToDeciaml(String pStr) {
            if (pStr == "")
                return 0;
            // 目标十进制数初始化为0
            long deciaml = 0;
            // 记录次方,初始为36进制长度 -1
            long power = pStr.length() - 1;
            // 将36进制字符串转换成char[]
            char[] keys = pStr.toCharArray();
            for (long i = 0; i < pStr.length(); i++) {
                // 拿到36进制对应的10进制数

                long value = thirysixToTen.get(keys[(int) i]);
                deciaml = (long) (deciaml + value * Math.pow(BASE, power));
                // 执行完毕 次方自减
                power--;
            }
            return deciaml;
        }

        public static long DeciamlToThirtySix(long iSrc, String pRet) {
            String str = DeciamlToThirtySix(iSrc);
            if (str.equals(pRet)) {
                return 0;
            } else {
                return 1;
            }
        }

        /**
         * 用递归来实现10 to 36
         *
         * @param iSrc
         * @return
         */
        public static String DeciamlToThirtySix(long iSrc) {
            String result = "";
            long key;
            long value;

            key = iSrc / BASE;
            value = iSrc - key * BASE;
            if (key != 0) {
                result = result + DeciamlToThirtySix(key);
            }

            result = result + tenToThirtysix.get(value).toString();

            return result;
        }

        public static void main(String[] args) {
            Set<Short> s = new HashSet<>();
            for (Short i = 0; i < 100; i++) {
                s.add(i);
                s.remove(i-1);
            }
            System.out.println(s.size());
        }
    }
