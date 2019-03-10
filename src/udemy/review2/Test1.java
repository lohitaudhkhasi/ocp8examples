package udemy.review2;

import java.io.IOException;

class ReadTheFile {
	static void print() throws Exception { // Line 4
		throw new IOException(); // Line 5
	}
}

public class Test1 {
	public static void main(String[] args) { // Line 10
		try {
			ReadTheFile.print(); // Line 11
		} catch (Throwable e) {

		}
		// Line 12
	}
}