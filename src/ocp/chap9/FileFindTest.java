package ocp.chap9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//Find number of Java files practiced
public class FileFindTest {
	public static void main(String args[]) throws AWTException,
			InterruptedException {
		Robot r = new Robot();

		int keyCode = KeyEvent.VK_A; // the A key
		Thread.sleep(10000);
		r.keyPress(keyCode);
		// later...
		r.keyRelease(keyCode);
	}
}
