package ocp.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericNonGenericDemo {
	public static void main(String args[]) {
		List<String> l = new ArrayList<String>();
		l.add("Test");
		l.add("Temp");
		System.out.println(l);
		twist(l);
		System.out.println(l);
	}

	private static void twist(List l) {
		l.add(10.5);
		List<? extends Number> test = new ArrayList<Integer>();
	}

}
