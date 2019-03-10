package ocp.chap6;

import javax.management.RuntimeErrorException;

public class JammedTurkeyCageTest implements AutoCloseable {
	public static void main_1(String args[]) {
		try (JammedTurkeyCageTest e = new JammedTurkeyCageTest();) {
			System.out.println("put turkeys in");
			// throw new IllegalArgumentException("turkeys ran off"); // Primary
			// Exception
			throw new RuntimeException("put turkeys in");
		} catch (IllegalArgumentException e) {
			System.out.println("caught:" + e.getMessage());
			for (Throwable r : e.getSuppressed()) {
				System.out.println(r.getMessage());
			}
		}
	}

	// Exception is finally override the exception coming form try and catch
	// block
	public static void main(String args[]) {
		try (JammedTurkeyCageTest e = new JammedTurkeyCageTest();) {
			System.out.println("put turkeys in");
			// throw new IllegalArgumentException("turkeys ran off"); // Primary
			// Exception
			throw new IllegalArgumentException("turkeys ran off");
		} finally {
			throw new RuntimeException("and we couldn't find them");
		}
	}

	public void close() throws IllegalArgumentException {
		throw new IllegalArgumentException(
				"turkey cage could not be closed for some reason");
	}
}
