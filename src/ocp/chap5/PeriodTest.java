package ocp.chap5;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest {
	public static void main(String args[]) {
		LocalDate dateOne = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate dateTwo = LocalDate.of(2016, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		performAnimalEnrichment(dateOne, dateTwo, period);
		System.out.println(Period.ofMonths(13));
		System.out.println(Period.ofYears(1).ofMonths(2));
		System.out.println(Period.ofWeeks(2));
		System.out.println(Period.of(2, 3, 4));

		// Period can be added to date or dateTime , not time
	}

	/**
	 * 
	 * @param oneDate
	 * @param twoDate
	 * @param period
	 */
	private static void performAnimalEnrichment(LocalDate oneDate,
			LocalDate twoDate, Period period) {
		LocalDate upTo = oneDate;
		while (upTo.isBefore(twoDate)) {
			System.out.println("give me new toy:" + upTo);
			upTo = upTo.plusMonths(1);
		}
	}
}
