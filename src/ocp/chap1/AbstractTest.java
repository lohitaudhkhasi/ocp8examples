package ocp.chap1;

public class AbstractTest {

}

abstract class A {
	abstract void m1();

	abstract class B extends A {
		abstract void m1();
	}
}
