package ocp.chap5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.OffsetDateTime;

public class DateTest {
	public static void main(String args[]) {
		ZonedDateTime zdate = ZonedDateTime.now();
		System.out.println(zdate);
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		System.out.println(zoneId);
		ZonedDateTime z1date = ZonedDateTime.of(LocalDate.now(),
				LocalTime.now(), zoneId);
		System.out.println(z1date);
		ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("Asia"))
				.sorted().forEach(System.out::println);
		ZoneId.systemDefault();
		LocalDate date1 = LocalDate.of(2017, Month.JANUARY, 23).plusDays(1)
				.minusMonths(2).plusYears(3);
		System.out.println(date1);
		LocalDate dateOne = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate dateTwo = LocalDate.of(2016, Month.MARCH, 30);
		performAnimalEnrichment(dateOne, dateTwo);

		LocalDateTime ldt = LocalDateTime.of(2017, 06, 02, 6, 0, 0); // Jun 2nd,
																		// 6AM.
		ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);
		ZoneId nyZone = ZoneId.of("America/New_York");
		OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
		ZonedDateTime nyZdt = ldt.atZone(nyZone);
		System.out.println(nyOdt); // 11
		System.out.println(nyZdt); // 10
		Duration.between(nyOdt, nyZdt); // 10-11 = -1, hence answer would be
										// PT-1H
		LocalDate d1 = LocalDate.of(2019, 1, 2);
		LocalDateTime d2 = LocalDateTime.of(2019, 1, 2, 00, 00, 00);
		LocalDateTime d3 = LocalDateTime.of(2019, 1, 2, 00, 00, 00);
		System.out.println(d1.equals(d2) + ":" + d1.isEqual(d2));

	}

	/**
	 * 
	 * @param startDate
	 * @param endDate
	 */
	private static void performAnimalEnrichment(LocalDate startDate,
			LocalDate endDate) {
		LocalDate upTo = startDate;
		while (upTo.isBefore(endDate)) {
			System.out.println("give me new toy:" + upTo);
			upTo = upTo.plusMonths(1);
		}
	}
}

class A {
	private int i;

	public void modifyOther(A a1) {
		a1.i = 20; // 1
	}
}
