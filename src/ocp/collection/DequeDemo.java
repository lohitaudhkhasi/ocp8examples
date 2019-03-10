package ocp.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	public static void main(String args[]) {
		Deque<Integer> test = new ArrayDeque<>();
		test.push(1);
		test.push(2);
		test.push(3);
		System.out.println("after pushing 123: " + test);
		System.out.println(" Peek First:" + test.peekFirst());
		System.out.println(" Peek Last:" + test.peekLast());
		System.out.println("Only peek:" + test.peek());
		System.out.println(test.removeFirst());
		System.out.println(test);
		test.offer(4);
		test.offer(5);
		System.out.println(test);
	}
}

class PlaceHolder<K, V> { // 1
	private K k;
	private V v;

	public PlaceHolder(K k, V v) { // 2
		this.k = k;
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public static <X> PlaceHolder<X, X> getDuplicateHolder(X x) { // 3
		return new PlaceHolder<X, X>(x, x); // 4
	}
}