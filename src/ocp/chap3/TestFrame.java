package ocp.chap3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

public class TestFrame extends Frame implements Classic {
	static String s = "Message";
	int version = 2;

	public void read() {

		System.out.println(((Classic) this).version);

	}

	public static void main(String args[]) {
		TestFrame t = new TestFrame();
		Button b = new Button("press me");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Message is " + s);
			}
		});
		t.add(b);
		t.read();
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();

		for (int i = 324; i <= 328; i++) {
			if (i == 327) {
				continue;
			}
			s.add(i);

		}
		subs = (TreeSet) s.subSet(326, true, 328, true);
		subs.add(327);
		System.out.println(s + " " + subs);
	}

	public static void myMethod(int x) // Specify throws clause here
	{
		try {
			if (x == 0) {
				throw new IllegalStateException();
			} else
				throw new ArithmeticException();
		} catch (RuntimeException e) {
			throw e;
		}
	}

}

interface Classic {
	int version = 1;

	public void read();
}