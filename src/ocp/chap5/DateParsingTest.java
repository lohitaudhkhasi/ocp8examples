package ocp.chap5;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateParsingTest {
	public static void main(String[] args) {
		DateTimeFormatter dfFull = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dfMedium = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dfShort = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter dfPattern = DateTimeFormatter
				.ofPattern("yyyy-MMM-dd");
		LocalDate ld = LocalDate.now();
		System.out.println(LocalDate.parse("2018-Jan-23", dfPattern).ofYearDay(
				2018, 1));
		ZoneId.getAvailableZoneIds();
	}
}
