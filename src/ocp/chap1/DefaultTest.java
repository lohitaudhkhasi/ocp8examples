package ocp.chap1;

public class DefaultTest implements ExtDef {
	public static void main(String[] args) {
		DefaultTest defaultTest = new DefaultTest();
		defaultTest.simpleMethod();
		defaultTest.methodDef();
		defaultTest.method();
	}

	@Override
	public void simpleMethod() {
		System.out.println("Simple method");
	}
}

interface Def {
	static void method() {
		System.out.println("returns method");
	}

	default void methodDef() {
		System.out.println("default method");
	}

	void simpleMethod();
}

interface ExtDef extends Def {
	/*
	 * static void methodDef () { // static cannot hide default impl
	 * 
	 * }; static void simpleMethod() { // we cannot make normal method as static
	 * too
	 * 
	 * }
	 */
	default void method() { // stattic can be converted to default
		System.out
				.println("retunrs overrided method converted from static to default ");
	}
	// default static void test (){ Invalid - default static could not be
	// together
}
