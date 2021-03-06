package ocp;

import java.awt.Robot;

public class WindowUnicodeKeyboard extends Keyboard {

	private Robot robot;

	public WindowUnicodeKeyboard(Robot robot) {
		super(robot);
		this.robot = robot;
	}

	@Override
	public void type(char character) {
		try {
			super.type(character);
		} catch (IllegalArgumentException e) {
			String unicodeDigits = String.valueOf(Character
					.getCodePoint(character));
			robot.keyPress(VK_ALT);
			for (int i = 0; i < unicodeDigits.length(); i++) {
				typeNumPad(Integer.parseInt(unicodeDigits.substring(i, i + 1)));
			}
			robot.keyRelease(VK_ALT);
		}
	}

	private void typeNumPad(int digit) {
		switch (digit) {
		case 0:
			doType(VK_NUMPAD0);
			break;
		case 1:
			doType(VK_NUMPAD1);
			break;
		case 2:
			doType(VK_NUMPAD2);
			break;
		case 3:
			doType(VK_NUMPAD3);
			break;
		case 4:
			doType(VK_NUMPAD4);
			break;
		case 5:
			doType(VK_NUMPAD5);
			break;
		case 6:
			doType(VK_NUMPAD6);
			break;
		case 7:
			doType(VK_NUMPAD7);
			break;
		case 8:
			doType(VK_NUMPAD8);
			break;
		case 9:
			doType(VK_NUMPAD9);
			break;
		}
	}

}