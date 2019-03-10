package ocp.pages.notes1;

import java.io.Console;
import java.io.IOException;
import java.sql.SQLException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

abstract public class Page17 implements I1 {
	public static void main(String[] args) throws IOException, SQLException {
		System.out.printf("%s%n%<d%n", 10);
		ZoneOffset zoneOffset = ZoneOffset.of("-04:00");
		ZoneId zone = ZoneId.ofOffset("UTC", zoneOffset);
		OffsetDateTime offsetDate = OffsetDateTime.ofInstant(Instant.now(),
				zone);
		System.out.println(offsetDate);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(df.format(offsetDate));
		new Random().ints(1, 8).limit(20).forEach(System.out::println);
		System.out.println(System.getProperty("path.separator") + " "
				+ System.getProperty("file.separator") + " "
				+ System.getProperty("line.separator"));
		byte x1 = (byte) 23450;
		System.out.println(x1);
		try {

		} catch (Exception e) {

		}
		Console c = System.console();
		if (c != null) {
			try {
				int character = c.reader().read();
				System.out.println(character);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			throw new SQLException("sql error bhago");
		} finally {
			try {

			} finally {
				int x = 0;
				if (x == 0) {
					throw new IOException();
				}
			}
		}

	}

	// abstract can only be public or protected
	abstract void test();

	public void testme() {
		ThreadLocalRandom.current().in
		throw new SQLException();
	}
}

interface I1 {
	public void testme() throws SQLException;
}