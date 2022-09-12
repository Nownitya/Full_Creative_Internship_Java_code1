package Java.T1_MultiThreading.MT2_MultiThreading;

//  start()
/**
 * It starts the execution of the thread and
 * then calls the run() on this Thread object.
 */
public class StartThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        StartThread thread1 = new StartThread();
        thread1.start();
    }

}


