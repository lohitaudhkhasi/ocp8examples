package ocp.chap7;

public class CheckResults {
	private static int counter = 0;

	public static void main(String args[]) {
		new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				CheckResults.counter++;
			}
		}).start();

		while (CheckResults.counter < 100) {
			System.out.println(CheckResults.counter);
			System.out.println("Not reached");
			System.out.println(CheckResults.counter);
		}
		System.out.println("Reached");
	}
}
