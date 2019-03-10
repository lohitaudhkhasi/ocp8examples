package udemy.review1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class AssertReview {
	public int hashCode() {
		return 100;
	}

	private static void checkStatus() {
		assert 1 == 2 : new RuntimeException("Asssert Error my");
	}

	public static void main_1(String[] args) {
		try {
			checkStatus();
		} catch (Exception e) {
		} catch (Error ae) {
			System.out.println("test");
			System.out.println(ae.getCause());
		}
	}

	public static <T> void print1(A<? extends Dog> obj) {
		// obj.set(new Dog()); // Line 22
		System.out.println(obj.get().getClass());
	}

	public static <T> void print2(A<? super Dog> obj) {
		obj.set(new Dog()); // Line 27
		System.out.println(obj.get().getClass());
	}

	public static void main(String[] args) throws IOException {
		A<Dog> obj = new A<>();
		// print1(obj); // Line 33
		// print2(obj); // Line 34
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any number between 1 and 10: ");
		int num = br.read();
		System.out.println(num);
		Path p = Paths.get("C:\\a\\");
		System.out.println(p.getFileName() + "," + p.getNameCount());
		int res = 1;
		IntStream stream = IntStream.rangeClosed(1, 2);

		System.out.println(stream.reduce(res++, (i, j) -> i * j));

		Flags flags = Flags.FALSE;
	}
}

@FunctionalInterface
interface Main {
	void test();
}

interface MainEx extends Main {
	public default void test1() {
		System.out.println("test");
		Test t = new Test() {

			@Override
			public void test() {
				// TODO Auto-generated method stub

			}

		};
	}
}

enum Flags {
	TRUE, FALSE;

	Flags() {
		System.out.println("HELLO");
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class A<T> {
	T t;

	void set(T t) {
		this.t = t;
	}

	T get() {
		return t;
	}
}

abstract class Test {
	public abstract void test();
}

interface I9 {
	void print();
}

class Test1 {
	public static void main_2(String[] args) {
		int i = 400;
		I9 obj = () -> System.out.println(i);
		obj.print();
		System.out.println(i);

	}
}

class X {
	class Y {
		private void m() {
			System.out.println("INNER");
		}
	}

	public void invokeInner() {
		Y obj = new Y(); // Line 9
		obj.m(); // Line 10
	}
}