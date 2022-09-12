package Java.T1_MultiThreading.MT2_MultiThreading;
//  setPriority

/**
 * This method is used to change the priority of the thread.
 * The priority of every thread is represented by the integer number
 * from 1 to 10. The default priority of a thread is 5.
 */
public class SetPriorityThread extends Thread {
    public void run() {
        System.out.println("Priority of Thread is: " + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        SetPriorityThread t1 = new SetPriorityThread();
        SetPriorityThread t2 = new SetPriorityThread();
        SetPriorityThread t3 = new SetPriorityThread();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
