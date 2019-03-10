package ocp.chap3;

import java.util.function.Supplier;

// E for element , K<V for Key, Value , N for number , T for generic data TYpe , SUV for generic data Types
public class Crate<T> {
	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(Supplier<T> contents) {
		this.contents = contents.get();
	}

}

class LimitedSizeCrate<T, U> {
	private T contents;
	private U size;

	public void packCrate(Supplier<T> contents, U size) {
		this.contents = contents.get();
		this.size = size;
	}
}

// Process of removing Generics syntax from the code is called as Type Erasure
class Test {
	public void funMethod() {
		Crate<Elephant> ep = new Crate<>();
		ep.packCrate(Elephant::new);
		LimitedSizeCrate<Elephant, Integer> ep1 = new LimitedSizeCrate<>();
		ep1.packCrate(Elephant::new, 15_000);
	}
}

class ShippableCrate implements Shippable<Elephant> {
	public void ship(Elephant ep) {
		System.out.println("Shipping elephantum");
	}
}

class Elephant {

}

interface Shippable<T> {
	void ship(T t);
}
