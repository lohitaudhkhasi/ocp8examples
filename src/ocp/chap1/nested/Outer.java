package ocp.chap1.nested;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ocp.p1.A;

public class Outer {
	private String greetings = "Hello";

	interface TestInterface {
		public void testMeInner();
	}

	protected class Inner implements TestInterface {
		public int repeat = 3;
		private String greetings = "Hi";

		public void go() {
			for (int i = 0; i < repeat; i++) {
				System.out.println(Outer.this.greetings);
			}
		}

		@Override
		public void testMeInner() {
			// TODO Auto-generated method stub

		}
	}

	protected static class InnerStatic implements TestInterface {
		public int repeat = 3;
		private String greetings = "Hi";

		interface TestRun extends Runnable {
		}

		public void go() {
			Outer outer = new Outer();
			for (int i = 0; i < repeat; i++) {
				System.out.println(outer.greetings);
			}
			List<? extends Runnable> runList = new ArrayList<>();
			runList.add(new TestRun() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
				}
			});
		}

		@Override
		public void testMeInner() {
			// TODO Auto-generated method stub

		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.callInner();
		System.out.println("Calling by creating instance");
		outer.new Inner().go();
		Outer.Inner inner = outer.new Inner();
		Office off = new HomeOffice(); // 1
		System.out.println(off.getAddress());
	}
}

interface I {

}

enum EnumC {
	A("a"), AA("a"), AAA("a");
	static int i = 0;
	static String prefix = " i am ";
	String name;

	EnumC(String s) {
		name = s;
	}
};

interface House {
	public default String getAddress() {
		return "101 Main Str";
	}
}

interface Office {
	public static String getAddress() {
		return "101 Smart Str";
	}
}

interface WFH extends House, Office {
}

class HomeOffice implements House, Office {
	public String getAddress() {
		return "R No 1, Home";
	}
}

class BookStore {
	Map<Book, Integer> map = new HashMap<Book, Integer>();

	int getNumberOfCopies(Book b) {
		return map.get(b);
	}

	public void addBook(Book b, int numberofcopies) {
		map.put(b, numberofcopies);
	}

}

class Book {
	private String title, isbn;

	public boolean equals(Object o) {
		return (o instanceof Book && ((Book) o).isbn.equals(this.isbn));
	}

	// ... setters and getters for title and isbn
}

class B extends A {
	public void process(A a) {
		a.i = a.i * 2;
	}

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		b.process(a);
		System.out.println(a.getI());
	}
}