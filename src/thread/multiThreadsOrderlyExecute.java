package thread;

import java.util.concurrent.CompletableFuture;

/**
 * @description: 多个线程有序执行
 * @author: hong
 * @date: 2025/5/20 13:01
 * @version: 1.0
 */

public class multiThreadsOrderlyExecute {
    /**
     * @description: 基于join实现
     * @author: hong
     * @date: 2025/5/20 13:08
     * @version: 1.0
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("t1 执行");
        });
        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t2 执行");
        });
        Thread t3 = new Thread(() -> {
            try {
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t3 执行");
        });

        t1.start();
        t2.start();
        t3.start();
    }




    /**
     * @description: 基于嵌套调用实现
     * @author: hong
     * @date: 2025/5/20 13:08
     * @version: 1.0
     */
//    public static void main(String[] args) {
//
//        Thread t1 = new Thread(() -> {
//            System.out.println("t1 执行");
//        });
//
//        Thread t2 = new Thread(() -> {
//            System.out.println("t2 执行");
//            t1.start();
//        });
//
//        Thread t3 = new Thread(() -> {
//            System.out.println("t3 执行");
//            t2.start();
//        });
//
//        t3.start();
//    }
}
