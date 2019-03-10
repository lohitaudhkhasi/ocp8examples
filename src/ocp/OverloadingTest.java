package ocp;

import ocp.XX.XStatic;

public class OverloadingTest {
	public static void main(String[] args) {
		// XStatic.<some method>
	}
}

class X {
	private int a;

	public static void m1() {
		System.out.println("this is X.m1():" + this.a);
	}
}

interface XTest {
	public static void m1() {
		class T {

		}
	}

	public static void m() {

	}

	interface InnerTest {

	}
}

interface XXTest extends XTest {

	public default void m() {

	}
}
