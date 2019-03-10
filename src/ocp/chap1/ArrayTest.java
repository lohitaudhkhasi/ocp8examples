package ocp.chap1;

public class ArrayTest {
	public static void main(String[] args) {
		Object[] animals = new Dog[2];
		animals[0] = new Object();
		animals[1] = new Dog();
		// animals[0].eat();
		// animals[1].eat();
	}
}

class Animal {
	void eat() {
		System.out.println("Animal is eating.");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog is eating biscuit.");
	}
}