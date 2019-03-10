package ocp.chap7;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTest {
	public static void main(String args[]) {
		ScheduledExecutorService service = Executors
				.newSingleThreadScheduledExecutor();
		Runnable task1 = () -> System.out.println("Hello zoo");
		Callable<String> task2 = () -> "Monkey";
		Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
		service.shutdown();
		/*
		 * Four flavors scheulde (Callable<V> callable, long delay, TimeUnit)
		 * schedule (Runnabke<V>, long delay, Timeunit)
		 * scheduleAtFixedRate(Runnable command, long initialDelay, long period,
		 * TimeUnit) scheduleAtFixedDelay(Runable comman, long initialDealy,
		 * long delay, Timeunit)
		 */

	}
}
