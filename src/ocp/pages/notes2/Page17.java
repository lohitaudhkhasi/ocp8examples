package ocp.pages.notes2;

import ocp.pages.notes2.Xint.Yint;

public class Page17 implements Xint {
	public static void main(String[] args) {

	}

	@Override
	public void m1() {
		System.out.println("Test");
	}
}

class Page171 implements Yint {
	@Override
	public void m2() {
		System.out.println("Test1");
	}
}

interface Xint {
	public void m1();

	interface Yint {
		public void m2();
	}
}