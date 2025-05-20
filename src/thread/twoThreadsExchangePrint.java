package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 两个线程交替打印 0-100
 * @author: hong
 * @date: 2025/5/20 12:28
 * @version: 1.0
 */
public class twoThreadsExchangePrint {

    /**
     * @description: 基于锁，等待和唤醒实现
     * @author: hong
     * @date: 2025/5/20 12:53
     * @version: 1.0
     */
    static AtomicInteger i = new AtomicInteger(0);
    static Object obj = new Object();
    public static void main(String[] args) {

        new Thread(() -> {
            while(i.get() <= 100){
                synchronized (obj) {
                    obj.notify();

                    System.out.println(Thread.currentThread().getName() + ":" + i.getAndIncrement());

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while(i.get() <= 100){
                synchronized (obj) {
                    obj.notify();

                    System.out.println(Thread.currentThread().getName() + ":" + i.getAndIncrement());

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

    }

    /**
     * @description: 基于共享标志位实现
     * @author: hong
     * @date: 2025/5/20 12:52
     * @version: 1.0
     */
//    static AtomicInteger i = new AtomicInteger(0);
//    static volatile boolean flag = true;
//    public static void main(String[] args) {
//        new Thread(() -> {
//            while (i.get() <= 100) {
//                if (flag) {
//                    System.out.println(Thread.currentThread().getName() + ":" + i.getAndIncrement());
//                    flag = false;
//                }
//            }
//        }).start();
//
//        new Thread(() -> {
//            while (i.get() <= 100) {
//                if (!flag) {
//                    System.out.println(Thread.currentThread().getName() + ":" + i.getAndIncrement());
//                    flag = true;
//                }
//            }
//
//        }).start();
//    }
}
