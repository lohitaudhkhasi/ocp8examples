import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
//asert boolean expression 
//assert boolean expresssion : message
import java.util.stream.Collectors;

public class AssertTest {
	public static void main(String args[]) {
		int num = -5;
		assert num > 0 : "This is less than 0";
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
		List v = null;
		assert true : v = new ArrayList();
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
