package ocp.pages.notes1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Page16 {
	public static void main(String[] args) {
		Number[] numArray = new Integer[3];
		// if array has been re-assigned, then only that particular type of
		// element should be stored
		// numArray[0] = new Short((short) 10);
		LocalTime lt = LocalTime.of(23, 59, 59, 9999999);
		// 009 999 999
		LocalDate ld = LocalDate.of(2019, 1, 2);
		System.out.println(lt);
		System.out.println(ld);

	}
}
