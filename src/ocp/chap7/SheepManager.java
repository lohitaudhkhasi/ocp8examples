package ocp.chap7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
	private int sheepCount = 0;
	private static AtomicInteger sheepCount2 = new AtomicInteger(0);

	private void incrementAndGet() {
		synchronized (this) {
			System.out.println((++sheepCount) + "");
		}

	}

	public static void main(String args[]) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			final SheepManager manager = new SheepManager();
			for (int i = 0; i < 10; i++) {
				synchronized (manager) {
					service.submit(() -> manager.incrementAndGet());
					System.out.println("Atomicone:"
							+ sheepCount2.incrementAndGet());
				}
			}
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
	}

}
