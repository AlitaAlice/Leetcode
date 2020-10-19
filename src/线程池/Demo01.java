package 线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 16:37 2020/9/18
 */

/**
 * 使用线程池来创建线程
 */
public class Demo01 {
    public static void main(String[] args) {
        //ExecutorService threadPool = Executors.newSingleThreadExecutor();
//        ExecutorService
    //    ExecutorService threadPool=  Executors.newFixedThreadPool(5) sdsd;
        ExecutorService threadPool=   Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 10; i++) {
                threadPool.execute(() ->
                {
                    System.out.println(Thread.currentThread().getName() + " OK");
                });

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        finally {
            threadPool.shutdown();
        }
    }

}
