package udemy.review2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

	public static void main(String args[]) {
		FileReader fileReader;
		try {
			fileReader = new FileReader("C:\\text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileReader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char[] test = new char[20];
		fileReader.read(test);

	}
}
