package ocp.chap5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Zoo_en_US extends ResourceBundle {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle
				.getBundle("ocp.chap5.Zoo", Locale.US);
		System.out.println(rb.getString("hello"));
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-yy-dd hh:mm");
		System.out.println(df.format(LocalDateTime.now()));
		System.out.println(LocalDate.parse("January-18-12", df));
	}

	@Override
	public Enumeration<String> getKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object handleGetObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object[][] getContents() {
		return new Object[][] { { "hello", "Hola" },
				{ "open", "The zoo is open" } };
	}

}
