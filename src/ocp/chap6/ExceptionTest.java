package ocp.chap6;

import java.util.Scanner;

/**
 * Need to learn about java.text.ParseException io.IOException
 * io.NotSerializable SQLException
 * 
 * Runtime lang.ArrayStoreException time.DateTimeException
 * util.MissingResourceException lang.IllegalStateException
 * lang.UnSupportedOperation
 * 
 * @author lohaudhk
 *
 */
// Java would not allow catch for checked Exception which could not be thrown

public class ExceptionTest implements AutoCloseable {
	public static void main(String args[]) throws CannotSwimException {
		throw new CannotSwimException(new RuntimeException());
		try (Scanner s = new Scanner(System.in)) {
			s.nextLine();
		} catch (Exception e) {
			s.nextLine(); // s has gone out of scope
		} finally {
			s.nextLine(); // s has goine out of scope
		}
	}

	// public void close() throws Exception
	public void close() throws Exception {
		System.out.println("Gate closed");
	}
}

class CannotSwimException extends Exception {
	public CannotSwimException() {
		super();
	}

	public CannotSwimException(Exception e) {
		super(e);
	}

	public CannotSwimException(String s) {
		super(s);
	}
}

// Multi-catch only catches those which are not redundant
class DangerInTheWater extends RuntimeException {
}

class SharkInTheWaterException extends DangerInTheWater {
}

class Dolphin {
	public void swim() throws CannotSwimException {
		// logic here
	}
}