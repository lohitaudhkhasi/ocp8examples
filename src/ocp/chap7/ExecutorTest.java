package ocp.chap7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
	ExecutorService service1 = Executors.newSingleThreadExecutor();
	ExecutorService service3 = Executors.newSingleThreadScheduledExecutor();
	ExecutorService service2 = Executors.newFixedThreadPool(2);
	ExecutorService service4 = Executors.newCachedThreadPool(); // Unbounded
																// size but
																// re-use the
																// one if one is
																// already
																// opened.
	ExecutorService service5 = Executors.newScheduledThreadPool(2);

	// In Pool Thread exceutor , if pool runs out of available threads, the task
	// will be queued by the thread executor and wait to be completed
	public static void main(String args[]) {
		// Number of available processor
		int processor = Runtime.getRuntime().availableProcessors();
		System.out.println(processor);
	}
}
