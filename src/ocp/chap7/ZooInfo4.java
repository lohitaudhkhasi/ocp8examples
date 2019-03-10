package ocp.chap7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Even single threaded executor could not gaurantee the execution order
 * 
 * @author lohaudhk
 *
 */
public class ZooInfo4 {
	public static void main(String args[]) {
		ExecutorService exec = null;
		try {
			exec = Executors.newSingleThreadExecutor();
			exec.submit(() -> "Printing zoo inventory");
			exec.submit(() -> {
				for (int i = 0; i < 3; i++) {
					System.out.println("Printing record:" + i);
				}
			});
			exec.submit(() -> "printing ended for zoo inventoty");
			exec.execute(() -> System.out.println("ok this is execute"));
			List<Callable<Integer>> runnableList = new ArrayList<>();
			runnableList.add(() -> {
				System.out.println("one");
				return 1;
			});
			runnableList.add(() -> {
				System.out.println("oneone");
				return 2;
			});
			runnableList.add(() -> {
				System.out.println("onetwo");
				TimeUnit.SECONDS.sleep(30);
				return 3;
			});

			exec.submit(() -> {
				Thread.sleep(1000);
				return null;
			});
			exec.submit(() -> {
				Thread.sleep(1000);
			});
			try {
				List<Future<Integer>> futureList = exec.invokeAll(runnableList);
				for (Future future : futureList) {
					System.out.println(future.get(10, TimeUnit.SECONDS));
					System.out.println(future.isDone());
				}
			} catch (InterruptedException | ExecutionException
					| TimeoutException e) {
				e.printStackTrace();
			}
		} finally {
			if (exec != null) {
				exec.shutdown();
			}
			System.out.println("Shutdonw:" + exec.isShutdown());
			System.out.println("Terminated:" + exec.isTerminated());
			// Shutdown Rejects new task , and while current task are
			// processing, status off executor remains isTerminated as false
			// Imeediate shutdown , shutdownNow()
			// ShutdownNow --> List of threads that were never started
		}
	}
}
