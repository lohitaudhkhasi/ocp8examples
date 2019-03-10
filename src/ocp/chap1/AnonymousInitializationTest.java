package ocp.chap1;

public class AnonymousInitializationTest {
	public static void main(String[] args) {
		InitMe i = new InitMe(2) {

		};
		InitMeToo i2 = new InitMeToo() {

			@Override
			public void initme(int x) {

			}
		};
	}
}

class InitMe {
	int x;

	public InitMe(int x) {
		this.x = x;
	}
}

interface InitMeToo {
	public void initme(int x);
}
