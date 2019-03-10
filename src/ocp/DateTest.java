package ocp;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTest {
	public static void main(String[] args) {
		ZonedDateTime zd = ZonedDateTime.now();
		System.out.println(zd);
		System.out.println(ZoneId.getAvailableZoneIds());
		System.out.println(zd.now(ZoneId.of("America/Guatemala")));
	}
}
