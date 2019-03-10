package ocp.chap6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TrWithResourceTest {
	static ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	
	{
		service.scheduleAtFixedRate(paramRunnable, paramLong1, paramLong2, paramTimeUnit)
	}
	public static void main(String[] args) {
		// Device device = null;
		try (Device device = new Device()) {

		} finally {
			// device.close();
		}
		
	}
}

class Device implements AutoCloseable {
	public void close() {
		System.out.println("Ok, I am closing the device");
	}
}