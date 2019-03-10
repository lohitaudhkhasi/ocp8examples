package ocp.chap1;

public class AutoBoxingTest {
	public static void main(String[] args) {
		Integer intBox = (Integer) null;
		System.out.println(intBox);

		// Below case gives exception
		// int intP = (Integer) null;
		// System.out.println(intP);

		Character c = 65;
		System.out.println(c);
		// See compiler error
		// Character ch = Integer.valueOf(65);
		new AutoBoxingTest().test(new Integer(23));
	}

	// Which version would be picked up test

	public void test(int i) {
		System.out.println("int primitive");
	}

	public void test(Integer i) {
		System.out.println("int wrapper");
	}

	public void test(Integer... i) {
		System.out.println("int array");
	}
}
