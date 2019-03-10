package ocp.pages.notes1;

public class Page19 implements I1 {
	public void testme() {
		System.out.println("I am from class");
		I1.super.testme();
	}

	public static void main(String[] args) {
		I1 i1 = new Page19();
		i1.testme();

	}
}

interface I1 {
	public default void testme() {
		System.out.println("I am from interface");
	}
}
