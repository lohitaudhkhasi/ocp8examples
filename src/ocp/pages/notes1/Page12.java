package ocp.pages.notes1;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.CopyOnWriteArrayList;

public class Page12 {
	public static void main(String[] args) {

		try (Connection c = DriverManager.getConnection("url", "user",
				"password");) {

		} catch (SQLException sqe) {

		}

		Properties p = new Properties();
		try (Connection c1 = DriverManager.getConnection("url", p);
				Statement st = c1.createStatement(ResultSet.TYPE_FORWARD_ONLY,
						ResultSet.CONCUR_READ_ONLY)) {

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ResourceBundle r = ResourceBundle.getBundle("myapps", Locale.CANADA);
		ResourceBundle r2 = new ListResourceBundle() {

			@Override
			protected Object[][] getContents() {
				String[][] array = { { "test", "abc" }, { "test1", "def" } };
				return array;
			}
		};

		Enumeration<String> keys = r2.getKeys();
		while (keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}

		List<String> copyOnWrite = new CopyOnWriteArrayList<>();
		copyOnWrite.add(0, "lohit");
		copyOnWrite.add(1, "lohitneha");
		copyOnWrite.add(2, "neha");
		Iterator<String> itr = copyOnWrite.iterator();
		while (itr.hasNext()) {
			itr.next();
			// throws Unsupported Operation as it is CopyOnWriteArrayList
			// itr.remove();
		}
		Console c = System.console();
		if (c != null) {
			char[] password = c.readPassword("Enter your password:");
			System.out.println(password);
		}
	}
}
