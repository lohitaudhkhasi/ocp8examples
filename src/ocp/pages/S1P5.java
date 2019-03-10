package ocp.pages;

public class S1P5 {
	static class InnerClass extends S1P5 {
		public int x = 10;

		static void main() {
			// x++;
			System.out.println("test");
		}
	}

	class Inner {

	}

	public static void main(String args[]) {
		S1P5 inst = new S1P5();
		Inner i = inst.new Inner();
		S1P5.Inner i1 = inst.new Inner();

	}
}
