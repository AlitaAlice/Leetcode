package 笔试;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 13:45 2020/9/13
 */
public class Mythread  extends Thread{
    public Mythread()
    {
        System.out.println(Thread.currentThread().getName());
    }
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

}
class MainThread
{
    public static void main(String[] args) {
        Thread.currentThread().setName("mainThread");
        Mythread mythread = new Mythread();
        mythread.setName("myThread");
        mythread.start();

    }
}
