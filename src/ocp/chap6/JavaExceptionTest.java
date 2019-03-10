package ocp.chap6;

import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class JavaExceptionTest {

	public static void main(String args[]) {
		JavaExceptionTest jc = new JavaExceptionTest();
		try {
			jc.multiCatch();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			jc.multiCatch_2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void parseData() throws SQLException, DateTimeParseException {

	}

	public void multiCatch() throws SQLException, DateTimeParseException {
		try {
			parseData();
			throw new NullPointerException();
		} catch (SQLException | DateTimeParseException e) {
			System.err.println("Error:" + e.getMessage());
			throw e;
		}
	}

	public void multiCatch_2() throws SQLException, DateTimeParseException {
		try {
			parseData();
			throw new NullPointerException();
		} catch (Exception e) {
			System.err.println("Error from 2:" + e.getMessage());
			throw e;
		}
	}
}
