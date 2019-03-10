package ocp.chap1.local;

public class LocalNestedTest {
	private int length = 5;

	public void calculate() {
		int width = 25;
		// Class local variables should be final or effectively final
		class Inner {
			public void multiply() {
				System.out.println(length * width);
			}
		}
		// Can be used only once the class is defined
		Inner inner = new Inner();
		inner.multiply();
	}

	public static void main(String args[]) {
		LocalNestedTest outer = new LocalNestedTest();
		outer.calculate();
	}
}
