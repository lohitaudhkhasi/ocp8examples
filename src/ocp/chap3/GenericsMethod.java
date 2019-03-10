package ocp.chap3;

import java.util.ArrayList;
import java.util.List;

import ocp.chap3.Crate;

public class GenericsMethod {
	// make sure that T is used between static declaration and before return
	// type. <T> has been declared to define T in parameters
	public static <T> Crate<T> ship(T t) {
		System.out.println("preparing " + t);
		return new Crate<T>();
	}

	public static <t> t test(t T) {
		System.out.println("weirdo");
		return T;
	}

	public static void main(String args[]) {
		GenericsMethod gem = new GenericsMethod();
		long test = gem.<Long> test(1234L);
		System.out.println(test);
		List numbers = new ArrayList();
		numbers.add(5);
		int result = numbers.get(0);

	}
}
