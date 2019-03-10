package ocp.pages.notes2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class pAGEx {
	int x = 10;
	private AtomicInteger i = new AtomicInteger(x);

	pAGEx(int val) {
		x = val;
	}

	public static void main(String[] args) {
		pAGEx x1 = new pAGEx(23);
		System.out.println(x1.i.decrementAndGet());

		abstract class T {

		}
		// LocalDate ld = LocalDate.of (Epoch(long), ofYearDay(
		
		Statement stmt = null;
		Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
		try(stmt = c.createStatement();)
		{

		    ResultSet rs = stmt.executeQuery("select * from STUDENT");
		    while(rs.next()){
		        System.out.println(rs.getString(0));
		    }

		}
		catch(SQLException e){
		    System.out.println("Exception ");
		}
	}
}

interface I {
	default boolean equals2(Object o) {
		return true;
	}
}