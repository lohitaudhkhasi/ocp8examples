package ocp.chap2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

public class InterfaceTest implements I1, I2 {

	public InterfaceTest() {
	}

	public String searchBook(final String s) {
		return "A";
	}

	@Override
	public void m1() throws Exception {
		ResourceBundle rs = ResourceBundle.getBundle("a.properties",
				new Locale.Builder().setLanguage("en").setRegion("US").build());

	}
}

// Bigger Interface can cover smaller one
interface I11 {
	void m1() throws IOException;

	public static void test() {
		System.out.println("test");
	}
}

interface I3 extends I1 {
	public default void test() {
		System.out.println("test");
		ThreadLocalRandom.current().nextInt(1, 10);
	}
}

interface I12 {
	void m1() throws FileNotFoundException;
}

interface I1 {
	void m1() throws java.io.IOException;
}

interface I2 {
	void m1() throws java.sql.SQLException;
}
