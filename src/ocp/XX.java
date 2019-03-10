package ocp;

public class XX extends X {
	static int nonStatic = 0;

	public void m1() {
		System.out.println("this is OverloadingTest.m1()");
		new XStatic().test();
	}

	public static void m2() {
		System.out.println("This is m2()");
	}

	static class XStatic {
		protected int j = 0;
		private int k = 0;
		public int jp = 0;

		public void test() {
			System.out
					.println("This is non static method in Xstatic, nonStatic:"
							+ nonStatic + j + k + jp);
			m2();
		}
	}

}
