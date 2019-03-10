package ocp.chap5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DurationTest {

	public static void main(String agrs[]) {
		// Duration work with time as period work with month, year, days
		// Start with PT (Period of Time)
		System.out.println(Duration.ofDays(1));
		System.out.println(Duration.ofHours(2));
		System.out.println(Duration.ofMillis(20));
		System.out.println(Duration.of(10, ChronoUnit.HALF_DAYS));
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Duration duration = Duration.ofHours(6);
		System.out.println(dateTime.plus(duration)); // 2015–01–20T12:15
		System.out.println(time.plus(duration)); // 12:15
		// System.out.println(date.plus(duration)); // Compile time error
		// because
		// date does not time , so
		// UnSupportedTemporalException
		Instant inst = Instant.now();
		try {
			Thread.sleep(100L);
		} catch (InterruptedException e) {

		}
		Instant inst2 = Instant.now();
		System.out.println(Duration.between(inst, inst2).toMillis());
		ZonedDateTime zd = ZonedDateTime.now();
		Instant i = zd.toInstant();

		System.out.println(i.ofEpochMilli(0));

		LocalDate datel = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime timel = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime1 = ZonedDateTime.of(datel, timel, zone);
		System.out.println(dateTime1);
		dateTime1 = dateTime1.plusHours(1);
		System.out.println(dateTime1);
	}
}
