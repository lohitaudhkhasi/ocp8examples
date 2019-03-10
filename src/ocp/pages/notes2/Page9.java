package ocp.pages.notes2;

import java.util.function.Consumer;

public class Page9 {
	public static void main(String[] args) {
		Consumer<String> x = (y) -> System.out.println("Hello " + y);
		System.out.println("test" + x.accept("tomtom"));
	}

	class Inner {

	}
}

interface TestInterface {
	final class InnerClass {

	}
}