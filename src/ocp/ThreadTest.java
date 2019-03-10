package ocp;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;

public class ThreadTest {
	public static synchronized void add(int a, int b) {
		System.out.printf("Starting to wait for add at %s%n",
				LocalDateTime.now());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("The sum is : %d + %d is %d", a, b, a + b);
	}

	public static synchronized void subtract(int a, int b) {
		System.out.printf("Starting to wait for subtract at %s%n",
				LocalDateTime.now());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("The subtract is : %d - %d is %d", a, b, a - b);
	}

	public synchronized void addNonStatic(int a, int b) {
		System.out.printf("Starting to wait for non static add at %s%n",
				LocalDateTime.now());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("The non static sum is : %d + %d is %d", a, b, a + b);
	}

	public synchronized void subtractNonStatic(int a, int b) {
		System.out.printf("Starting to wait for non static subtract at %s%n",
				LocalDateTime.now());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("The non static subtract  is : %d - %d is %d", a, b,
				a - b);
	}

	public static void main(String args[]) {
		new Thread(() -> {
			BiConsumer<Integer, Integer> t = ThreadTest::subtract;
			t.accept(10, 20);
		}).start();
		new Thread(() -> {
			BiConsumer<Integer, Integer> t = ThreadTest::add;
			t.accept(10, 20);
		}).start();
		new Thread(() -> {
			BiConsumer<Integer, Integer> t = new ThreadTest()::addNonStatic;
			t.accept(10, 20);
		}).start();
		new Thread(
				() -> {
					BiConsumer<Integer, Integer> t = new ThreadTest()::subtractNonStatic;
					t.accept(10, 20);
				}).start();
	}

	// Testing ordering matters
	public void m1(int a, String b) {

	}

	public void m1(String a, int b) {

	}
}
