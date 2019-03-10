package ocp.chap7;

import java.util.concurrent.Callable;
import java.util.function.Supplier;
import java.io.IOException;
//Supplier does not throw checked exception
//Callable can throw checked Exception

public class AmbiguousLambdaSample {
	public static void useCallable(Callable<Integer> expression) {
	}

	public static void useSupplier(Supplier<Integer> expression) {
	}

	public static void use(Supplier<Integer> expression) {
	}

	public static void use(Callable<Integer> expression) {
	}

	public static void main(String[] args) {
		useCallable(() -> {
			throw new IOException();
		}); // COMPILES
		useSupplier(() -> {
			throw new IOException();
		}); // DOES NOT COMPILE
		use(() -> {
			throw new IOException();
		}); // DOES NOT COMPILE

	}
}
