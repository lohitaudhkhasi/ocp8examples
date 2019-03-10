package ocp.exception;

import java.io.IOException;
import java.sql.SQLException;

class OpenException extends IOException {
}

class CloseException extends IOException {
}

// Old code
public class ExceptionTest {

	public static void main(String args[]) throws OpenException, CloseException {
		boolean flag = true;
		try {
			if (flag) {
				throw new OpenException();
			} else {
				throw new CloseException();
			}
		} catch (OpenException oe) {
			System.out.println(oe.getMessage());
			throw oe;
		} catch (CloseException ce) {
			System.out.println(ce.getMessage());
			throw ce;
		}
	}
}

class ExceptionNewTest {

	public static void main(String args[]) throws OpenException, CloseException {
		boolean flag = true;
		try {
			if (flag) {
				throw new OpenException();
			} else {
				throw new CloseException();
			}
		} catch (IOException oe) {
			System.out.println(oe.getMessage());
			throw oe;
		}
	}
}