package ocp.chap7;

/**
 * Making a class runnable let it to be used by various concurrency APIs
 * Specially ExceutorService
 */
public class ReadInventoryThread extends Thread {
	public void run() {
		System.out.println("printing zoo memory");
	}

	public static void main(String args[]) {
		new ReadInventoryThread().start();
	}
}
