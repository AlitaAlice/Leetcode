package bishi;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 20:36 2020/8/29
 */
public class test4 {
    public static void main(String[] args) {
        String str = "___aaa__b____c__dd___";
        String str1 = null;
//        for (int  i = 0; i <100 ; i++) {
//
//        }
        String[] strings = str.split("_");
        for (int i = 0; i < strings.length ; i++) {
            System.out.print((strings[i]).trim());
            //System.out.print(" ");
        }

        //System.out.println(Arrays.asList(strings).toString());

    }
}
