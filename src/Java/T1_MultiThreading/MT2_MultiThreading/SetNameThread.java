package Java.T1_MultiThreading.MT2_MultiThreading;
//  setName()

/**
 * This method changes the name of the thread.
 */
public class SetNameThread extends Thread {
    public void run() {
        System.out.println("Thread is Running...");

    }

    public static void main(String[] args) {
        SetNameThread t1 = new SetNameThread();
        SetNameThread t2 = new SetNameThread();
        t1.start();
        t2.start();
        t1.setName("Full");
        t2.setName("Creative");

        System.out.println("After changing name of thread1:" +t1.getName());
        System.out.println("After changing name of thread2:" +t2.getName());
    }
}
