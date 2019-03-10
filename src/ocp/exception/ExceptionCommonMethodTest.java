package ocp.exception;

//This is test to show that Exception reference should have method common to all in multi catch 
public class ExceptionCommonMethodTest {
	public static void main(String[] args) {

	}

	public void test(int i) throws Y, Z {
		try {
			if (i == 0) {
				throw new Z();
			} else {
				throw new Y();
			}
		} catch (Y | Z e) {
			e.myLog(e.getMessage());
			throw e;
		}
	}
}

class Z extends X {

}

class X extends Exception {
	public void myLog(String message) {
		System.out.println("printing my log: " + message);
	}
}

class Y extends X {
}