import java.util.*;
public class Main{
    public static String reverse(String str , int start , int end){
        char[] arr = str.toCharArray();
        while (start < end ){
            char tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
        return String.copyValueOf(arr);
    }
    public static String func(String str , int k){
        if (str == null || k <= 0 || str.length() == 0){
            return null;
        }
        str =  reverse(str , 0 , k-1);
        str = reverse(str , k , str.length()-1);
        str = reverse(str, 0 , str.length()-1);
        return str;
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int k = scan.nextInt();
            String str = scan.next();
            String ret = func(str,k);
            System.out.println(ret);
        }

    }
}