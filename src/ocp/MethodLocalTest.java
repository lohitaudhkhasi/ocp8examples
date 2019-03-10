package ocp;

public class MethodLocalTest {
	public double calculateReservation(Passenger[] passengers) {
		class ReservationCosts {
			int minorAge = 6;
			int majorAge = 10;
		}
		ReservationCosts rc = new ReservationCosts();
		return rc.majorAge + rc.minorAge;
	}
}
