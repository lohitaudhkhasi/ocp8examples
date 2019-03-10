package ocp.exception;

import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;

;

public class NullExceptionTest {
	private static void m() throws SQLException {
		try {
			throw new SQLException();
		} catch (Exception e) {
			// Routine of throwing null exception actually cause the problem
			throw null; // Line 10
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(Duration.ofMillis(200));
			LocalDateTime d1 = LocalDateTime.now();
			LocalDateTime d2 = LocalDateTime.now().minusDays(1);
			System.out.println(Duration.between(d1, d2));
			m(); // Line 16
		} catch (SQLException e) {
			System.out.println("Caught Successfully.");
		}
	}
}
