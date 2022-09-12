package Java.T1_MultiThreading.MT2_MultiThreading;

public class DaemonThread extends Thread {
    public void run() {
        //  Checking for current daemon thread
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread work...");
        } else {
            System.out.println("User Thread works");
        }
    }

    public static void main(String[] args) {

        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
