package ocp.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//Compilation error if we dont provide generic to subclass
//public class GenericTest extends Generic<T> {
public class GenericTest<X, Y, T> extends Generic<T> {
	public static void main(String args[]) {
		List<? super GenericsTest> list = new ArrayList<>();
		list.add(null);
		list.add(new GenericsTest<String>() {
			public void test(String x) {
				System.out.println(x);
			}
		});
		list.add(new SubClass<String>());

	}
}

class Generic<T> {

	public <S> T testMe(T t, S s) {
		List<T> list = new ArrayList<>();
		return list.get(0);
	}
}

interface GenericsTest<T> {
	public void test(T t);
}

class GenericSuperClass<T> {

}

class SubClass<T> extends GenericSuperClass<T> implements GenericsTest<T> {

	@Override
	public void test(T t) {
		System.out.println("I am printing generic Yuhu");
	}

}

class Assertion {
	public void x(int k) {
		assert k == 0;
		System.out.println("k is " + k);
	}

	public static void main(String[] args)
    {
        Assertion  a = new Assertion();
        a.assert(Integer.parseInt(args[0])); //4
    }
}

enum Coffee // 1
{
	ESPRESSO("Very Strong"); // 2
	public String strength; // 3

	Coffee(String strength) // 4
	{
		this.strength = strength; // 5
	}
}

class CoolThread extends Thread {
	String id = "";

	public CoolThread(String s) {
		this.id = s;
	}

	public void run() {
		System.out.println(id + " End");
	}

	public static void main(String args[]) {
		Thread t1 = new CoolThread("AAA");
		t1.setPriority(Thread.MIN_PRIORITY);
		Thread t2 = new CoolThread("BBB");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

		File f = new File("x"); // 1
		BufferedReader bfr1 = new BufferedReader(new FileReader(f)); // 2
		BufferedReader bfr2 = new BufferedReader(bfr1); // 3
		PrintWriter pw = new PrintWriter(new FileReader(f)); // 4
	}

}

class PlaceHolder1<K, V> { // 1
	private K k;
	private V v;

	public PlaceHolder1(K k, V v) { // 2
		this.k = k;
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public static <X> PlaceHolder1<X, X> getDuplicateHolder(X x) { // 3
		return new PlaceHolder1<X, X>(x, x); // 4
	}
}

class Point {
	int x, y;
}

class ColoredPoint extends Point {
	int color;
}

class Test {
	static void test(ColoredPoint p, Point q) {
		System.out.println("(ColoredPoint, Point)");
	}

	static void test(Point p, ColoredPoint q) {
		System.out.println("(Point, ColoredPoint)");
	}

	public static void main(String[] args) {
		ColoredPoint cp = new ColoredPoint();
		test(cp, cp);
	}
}