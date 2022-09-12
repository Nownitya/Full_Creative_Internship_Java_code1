package Java.T1_MultiThreading.MT2_MultiThreading;

//  run()

/**
 * This thread is used to do an action for a thread.
 * The run() method is instantiated if the thread was constructed
 * using a separate Runnable object.
 */
public class RunThread implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        RunThread r1 = new RunThread();
        Thread thread1 = new Thread(r1);
        thread1.start();
    }
}
