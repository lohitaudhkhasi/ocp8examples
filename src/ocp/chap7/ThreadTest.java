package ocp.chap7;

/**
 * Terminology Thread - single unit performing task Processs - aasosciated group
 * of threads. Threads share same memory for a process. Runnable becomes
 * FunctionalInterface
 * 
 * @author lohaudhk
 *
 */
@FunctionalInterface
interface Runnable1 {
	public void run();
}

public class ThreadTest implements Runnable {
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		Thread a = new Thread() {
			public void run() {
				System.out.println("test");
			}
		};
		Thread t = new Thread(a);
		t.start();
	}
}
