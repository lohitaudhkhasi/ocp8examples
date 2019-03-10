package ocp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassicStreamTest {
	static int count = 2;
	static Supplier<Integer> supInt = () -> count++ + 2;

	public static void main(String args[]) {
		bookList.add(new Book("java", "goslin"));
		bookList.add(new Book("c", "lohit"));
		bookList.add(new Book("c", "neha"));
		bookList.add(new Book("python", "sanjay"));
		bookList.add(new Book("selenium", "gautam"));
		// Function to demo filter
		Comparator<Book> compBookByTitle = (Book b1, Book b2) -> {
			return b1.getTitle().compareTo(b2.getTitle());
		};
		Stream<Integer> test = Stream.generate(supInt).limit(5)
				.filter(x -> x > 7);
		test.forEach(System.out::println);
		Map<String, String> testMap = bookList
				.stream()
				.sorted(compBookByTitle)
				.collect(
						Collectors.toMap(x -> x.getTitle(), x -> x.getAuthor(),
								(v1, v2) -> (v1 + v2), TreeMap::new));
		System.out.println(testMap);
	}

	private static List<Book> bookList = new ArrayList<>();

}

class IntSup implements Supplier<Integer> {
	private static int count = 0;

	public Integer get() {
		return count + 2;
	}
}

class Book {
	private String title;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

}
