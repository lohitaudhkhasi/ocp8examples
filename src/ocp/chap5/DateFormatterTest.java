package ocp.chap5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterTest {
	public static void main(String[] args) {
		LocalDate valDay = LocalDate.of(2018, 2, 14);
		LocalDate date = LocalDate.of(2018, 11, 4);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-uuuu");
		System.out.println(valDay.format(formatter));
		// Date cannot be formatter to represent day of year as day of year
		// would exceed to 3 digits while date of months comes in two digits
		System.out.println(date.format(formatter));
	}
}
