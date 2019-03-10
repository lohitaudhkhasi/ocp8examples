package ocp.pages.notes1;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Function;

public class Page14 {
	static int x = 10;

	public static void main(String[] args) {
		// Error in itself
		// static int x = 10;
		x++;
		Function<Integer, Integer> addTenFuncs = x1 -> x1 + x;

		Consumer<Integer> incInt = (y) -> System.out.println(y++);
		incInt.accept(10);
		incInt.andThen(incInt).andThen(incInt).accept(x++);

		OptionalDouble od = OptionalDouble.empty();
		System.out.println(od.isPresent() ? od.getAsDouble() : od);

		Instant ins = Instant.now();
		System.out.println(ins);

		System.out.println(Duration.ofSeconds(2));
		System.out.println(Duration.ofMillis(2).ofDays(1));
		System.out.println(Duration.ofNanos(23)); // PT0.000000023S
		ZoneId usZone = ZoneId.of("America/New_york");
		ZonedDateTime zdx = ZonedDateTime.now();
		System.out.println(zdx.withZoneSameLocal(usZone));
		System.out.println(zdx.withZoneSameInstant(usZone));
	}
}
