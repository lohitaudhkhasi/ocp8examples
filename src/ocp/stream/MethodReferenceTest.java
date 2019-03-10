package ocp.stream;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class MethodReferenceTest {
	public static void main(String args[]) {
		// Static type
		BinaryOperator<Integer> test = Test::add;
		System.out.println(test.apply(2, 3));
		// New constructor
		Supplier<TestImpl> testSup = TestImpl::new;
		TestImpl t = testSup.get();
		t.func(2, 3);
		// Instance method
		BinaryOperator<Integer> testNew = t::multiply;
		BiConsumer<Integer, Integer> testConsumer = t::func;
		testConsumer.accept(3, 4);
		Comparator<String> conp = String::compareToIgnoreCase;
		StringComp t1 = new StringComp();
		Comparator<Integer> compInt = t1::compare;
	}
}

class StringComp implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2);
	}
}

@FunctionalInterface
interface Test {

	public abstract void func(int a, int b);

	public static int add(int a, int b) {
		return a + b;
	}

	public default int multiply(int a, int b) {
		return a * b;
	}
}

class TestImpl implements Test {
	public void func(int a, int b) {
		System.out.println("Subtracted diff is " + (a - b));
	}
}