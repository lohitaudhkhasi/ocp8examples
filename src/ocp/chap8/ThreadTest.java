package ocp.chap8;

public class ThreadTest extends Thread {

	private static int threadcounter = 0;

	public void run() {
		threadcounter++;
		System.out.println(threadcounter);
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			synchronized (ThreadTest.class) {
				// new ThreadTest().start();
				ThreadTest t = new ThreadTest();
				t.run();
			}
		}
	}

}

enum Pets {
	DOG("D"), CAT("C"), FISH("F");
	static String prefix = "I am ";
	String name;

	Pets(String s) {
		name = s;
	}

	public String getData() {
		return name + prefix;
	}
}