package ocp.chap1;

public class OverloadingTest {

	public Number test(Integer i) {
		System.out.println("In Test:" + i);
		return new Integer(i);
	}

	public Integer test(int... i) {
		System.out.println("in test...:" + i);
		return i[0];
	}

	public static void main(String args[]) {
		OverloadingTest test = new OverloadingTest();
		test.test(3);
	}
}

abstract class Cat {
	String name = "The Cat";

	static void clean() {
	}
}

class Lion extends Cat {
	// This is overloading the overriden method of static void clean()
	void clean(int test) {
	}
}