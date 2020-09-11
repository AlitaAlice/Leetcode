package 排序算法.选择排序;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 16:25 2020/9/8
 */
public class SelectionSort {

    public void selectionSort(int[] arr) {
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i; j <arr.length ; j++) {
//               if( arr[i]>arr[j+1])
//               {
//                   int temp=arr[i];
//                   arr[i]=arr[j+1];
//                   arr[j + 1] = temp;
//               }
//            }
//
//        }
//    }
        /**
         * 记录min下标
         */
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }


    }
}
