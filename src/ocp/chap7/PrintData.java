package ocp.chap7;

public class PrintData implements Runnable {

	public static void main(String[] args) {
		Runnable r = new PrintData();
		new Thread(r).start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Printing record:" + i);
		}
	}
}
