package ocp.chap4;

import java.util.function.Consumer;

class Counter {
	int count = 1;
}

public class LambdaTest {
	static int test = 20;
	static int nonStatic = 20;

	public static void main(String[] args) {

		Counter count = new Counter();
		count.count++;
		Consumer<Integer> add = i -> {
			nonStatic += i;
		};
		Consumer<Integer> print = System.out::println;
		add.andThen(print).accept(10); // Line 10

		String effectiveFinal = "I am non final local variable";
		Runnable r = () -> {
			System.out.println("Value of effectively variable is : "
					+ effectiveFinal);
		};
		System.out.println(null + "one" + "two");

	}
}