package ocp.chap6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
//asert boolean expression 
//assert boolean expresssion : message
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssertTest {
	public static void main(String args[]) {
		int num = -5;
		List<String> test = new ArrayList<String>();
		assert num > 0 : testVoid();
		System.out.println(num);
		Predicate<String> p = str -> {
			return true;
		};
		List<Book> books = Arrays.asList(new Book("Thinking in Java", 30.0),
				new Book("Java in 24 hrs", 20.0), new Book("Java Recipies",
						10.0));
		double averagePrice = books.stream().filter(b -> b.getPrice() > 10)
				.mapToDouble(b -> b.getPrice()).average().getAsDouble();
		System.out.println(averagePrice);
		List<Student> ls = Arrays.asList(new Student("S1", 20), new Student(
				"S3", 30), new Student("S3", 20));
		Stream.of(1, 2, 3).filter(x -> x < 2);
	}

	public static int testVoid() {
		return 1;
	}
}

class Book {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private double price;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	// getters/setters not shown
}

class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	private int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return name + ":" + marks;
	}
	// getters and setters not shown
}

// 70643
