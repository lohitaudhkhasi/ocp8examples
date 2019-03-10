package ocp.chap3;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoundTest {
	public static void main1(String args[]) {
		// Lower bound : ? super X // Upper Bound : X extends ? // ? wildcard
		// in generics , List<String> cannot be assigned to List<object>

	}

	public static void printList(List<? extends Object> list) {
		for (Object x : list)
			System.out.println(x);
	}

	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords); // DOES NOT COMPILE
		// List<Object> test = new ArrayList<String>();
		// It could be stored in Arrays , no compile time, but runtime would
		// still be thrown
		Object o[] = new String[2];
		List<?> birds = new ArrayList<String>();
		// birds.add("Test");
		// In upper bound , anything is extends , either we implement form
		// INterface or class
		// This is lower bound , anything lower than IOException , would not be
		// accepted
		List<? super IOException> exceptions = new ArrayList<Exception>();
		exceptions.add(new Throwable());
		exceptions.add(new IOException());
		exceptions.add(new EOFException());

		// In case of Upper bound, nothing can be added to list because Java
		// does not know what the list may look like
		List<? extends Exception> extendExceptionList = new ArrayList<IOException>();
		extendExceptionList.add(new Throwable());
		extendExceptionList.add(new Exception());
		extendExceptionList.add(new IOException());
		extendExceptionList.add(new EOFException());
	}

	private void anyFlyer(List<Flyer> flyer) {
	}

	// It uses extends , even if it is interface
	private void groupOfFlyers(List<? extends Flyer> flyer) {
	}

	interface Flyer {
		void fly();
	}

	class HangGlider implements Flyer {
		public void fly() {
		}
	}

	class Goose implements Flyer {
		public void fly() {
		}
	}

	static class Sparrow extends Bird {
	}

	static class Bird {
	}

	<T> T method1(List<? extends T> list){
		return list.get(0);
	}
	
	<T> <? extends T> method2(List<? extends T> list){ // Does not compile 
		return list.get(0);
	}
	
	<B extends A> B method3 (List<B> list){
		return new B(); // Type of B cannot be instantiated as same has been referedd in generics type parameters 
	}
	
	<X> void method5(List<X super B> list){
		
	}
	
}
