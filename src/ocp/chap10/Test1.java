package ocp.chap10;

import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;

public class Test1 {
	public static void main(String args[]) throws SQLException {
		String url = "jdbc:derby:zoo;create=true";
		Connection con = DriverManager.getConnection(url);
		try (Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
				ResultSet.CONCUR_UPDATABLE)) {
			// stmt.executeUpdate("CREATE Table species (id integer primary key , name varchar(255), num_acres decimal)");
			// stmt.executeUpdate("create table animal ( id integer primary key , species_id integer, name varchar(255), date_born timestamp)");
			// stmt.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
			// stmt.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");
			// stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001-05-06 02:15:00')");
			// stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002-08-15 09:12:00')");
			// stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002-09-09 10:36:00')");
			// stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010-06-08 01:24:00')");
			// stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005-11-12 03:44:00')");

			ResultSet rs = stmt
					.executeQuery("select date_born from animal where name = 'Elsa' or name = 'Zelda'");
			while (rs.next()) {
				java.sql.Date date = rs.getDate(1);
				java.time.LocalDate jDate = date.toLocalDate();
				System.out.println(jDate);
				date = Date.valueOf(LocalDate.now());
				rs.updateDate("date_born", date);
			}
			rs.updateRow();
		}
	}
}
