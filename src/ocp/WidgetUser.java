package ocp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Widget {

	String data = "data";

	public void doWidgetStuff() {
		System.out.println(data);
	}

}

class GoodWidget extends Widget {
	String data = "big data";

	public void doWidgetStuff() {
		int x = 0;

	}
}

public class WidgetUser {
	public static void main1(String[] args) {
		Widget w = new GoodWidget();
		((Widget) w).doWidgetStuff();

	}

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> future = es.submit(() -> {
			Thread.sleep(2000);
			System.out.println("test");
			return "test";
		});
		System.out.println(future.get()); // 1
		es.shutdownNow(); // 2
	}

}