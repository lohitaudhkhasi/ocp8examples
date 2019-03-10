package ocp.chap5;

import java.io.DataOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

abstract class LocaleTest {
	public static void main(String args[]) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale us = new Locale("en", "US");
		Locale fr = new Locale("fr", "FR");
		printProperties(us);
		printProperties(fr);
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.ENGLISH);
		System.out.println(sdf.format(new Date()));
		DataOutputStream dos = null;
		dos.write
	}

	private static void printProperties(Locale locale) {
		ResourceBundle r = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(r.getString("hello"));
		System.out.println(r.getString("open"));
	}
}
