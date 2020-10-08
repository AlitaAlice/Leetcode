package 笔试;
import java.util.Scanner;
public class App
{
    public static void main(String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings=str.split(" ");
        int[] input = StringToInt(strings);
        int inputLength = input.length;
        int tmp;
        while (inputLength!=0){
            for (int j=1;j<inputLength; j++){
                if (App.exchange(input[j-1],input[j])){
                    tmp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = tmp;
                }
            }
            inputLength--;
        }
        StringBuffer sb = new StringBuffer();
        for (int a : input){
            sb.append(a);
        }
        System.out.println(sb);

    }
    public static int[] StringToInt(String[] arrs){

        int[] ints = new int[arrs.length];

        for(int i=0;i<arrs.length;i++){

            ints[i] = Integer.parseInt(arrs[i]);

        }

        return ints;

    }
    public static boolean exchange(int a,int b){
        StringBuffer sb1 = new StringBuffer();
        sb1.append(a).append(b);
        StringBuffer sb2 = new StringBuffer();
        sb2.append(b).append(a);
        int m1 = Integer.parseInt(String.valueOf(sb1));
        int m2 = Integer.parseInt(String.valueOf(sb2));
        if (m1 < m2){
            return true;
        }else{
            return false;
        }

    }
}
