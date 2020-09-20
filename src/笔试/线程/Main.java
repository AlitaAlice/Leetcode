package 笔试.线程;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 20:09 2020/9/18
 */
public class Main {
    public static void main(String[] args) {
            PrintNumber printNumber = new PrintNumber();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <34 ; i++) {
                        printNumber.firstPrint();

                    }
                }
            }, "线程1").start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <33 ; i++) {
                        printNumber.secondPrint();

                    }
                }
            }, "线程2").start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <33; i++) {
                        printNumber.thirdPrint();

                    }
                }
            }, "线程3").start();

        }
    }
 class PrintNumber {
    private volatile int number = 1;
    private volatile int value = 1;

    void firstPrint() {
        synchronized (this) {
            while (value != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.println(Thread.currentThread().getName() + "打印" + number);
                number++;
                value = 2;
                notifyAll();

        }
    }

    void secondPrint() {
        synchronized (this) {
            while (value != 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.println(Thread.currentThread().getName() + "打印" + number);
                number++;
                value = 3;
                notifyAll();

        }
    }

    void thirdPrint() {
        synchronized (this) {
            while (value!=3)
            {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "打印" + number);
            number++;
            value = 1;
            notifyAll();
        }
    }
}