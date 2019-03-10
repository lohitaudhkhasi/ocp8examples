import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.sql.SQLException;
import java.util.concurrent.BrokenBarrierException;

public class ExceptionListTest {
	// Exception
	InterruptedException e1 = null;
	// Exception
	BrokenBarrierException e14 = null;
	FileNotFoundException e2 = null;
	DirectoryNotEmptyException e3 = null;
	// IndexOutOfBoundException > RunTimeException
	ArrayIndexOutOfBoundsException e4 = null;
	// >iLlegalargumentException > RunTimeException
	NumberFormatException e5 = null;
	SQLException e6 = null;
	IOException e7 = null;
	// extends RuntimeException
	IllegalArgumentException e8 = null;

	// >RuntimeException
	IllegalStateException e9 = null;

	// >FileSystemException > IOException
	NoSuchFileException e10 = null;
	InvalidPathException e11 = null;
	FileAlreadyExistsException e15 = null;

	// extends filesystemexception extends ioexception
	AccessDeniedException e12 = null;

	// extends IOexception
	FileSystemException e13 = null;
	{
		// Instance of is mixture of botyh compile time and runtime Mechanism
		Integer i = null;
		if (String instanceof null) {
			System.out.println("Null String");
		}
	}

	public static void main(String[] args) {
		System.out.println("" + Test.TEST1.deftest());
	}
}

enum Test {
	TEST1() {
		void test() {
			System.out.println("Test 1");
		}
	},
	TEST2() {
		@Override
		void test() {
			// TODO Auto-generated method stub

		}
	};

	abstract void test();

	static String deftest() {
		System.out.println("in deftest");
		return "";
	}
}

// Problem enum class cannot be extended
// enum ExtendedTest extends Test {

// }