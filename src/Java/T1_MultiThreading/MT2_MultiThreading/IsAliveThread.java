package Java.T1_MultiThreading.MT2_MultiThreading;

//  isAlive()

/**
 * This method checks if the thread is alive. A thread is in the alive state
 * if the start() method of thread class has been called and the thread has not yet died.
 */
public class IsAliveThread extends Thread {
    public void run() {
        try {
            Thread.sleep(300);
            System.out.println("is run() method isAlive " + Thread.currentThread().isAlive());

        } catch (InterruptedException ie) {
        }
    }

    public static void main(String[] args) {
        IsAliveThread t1 = new IsAliveThread();

        System.out.println("Before starting Thread isAlive: " + t1.isAlive());
        t1.start();
        System.out.println("After starting thread is isAlive: " + t1.isAlive());

    }

}
