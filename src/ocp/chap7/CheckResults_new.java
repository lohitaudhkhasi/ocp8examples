package ocp.chap7;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResults_new {
	private static int counter = 0;

	public static void main(String args[]) throws ExecutionException,
			InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> results = service.submit(() -> {
				for (int i = 0; i < 500; i++) {
					try {
						Thread.sleep(20);
					} catch (Exception e) {
						// TODO Auto-generated catch block
					e.printStackTrace();
				}
				CheckResults_new.counter++;
			}
		})	;
			results.get(10, TimeUnit.SECONDS);
			System.out.println("reached");
		} catch (TimeoutException t) {
			System.out.println("Not reached in time");
		} finally {
			if (service != null) {
				List<Runnable> futureList = service.shutdownNow();
				System.out.println(futureList.size());
			}
		}
	}
}
