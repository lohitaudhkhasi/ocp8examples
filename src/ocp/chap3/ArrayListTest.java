package ocp.chap3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("Fluffy");
		String[] array = new String[list.size()];
		System.out.println(list.size());
		List<String> fixedList = Arrays.asList(array);
		list.set(0, "Tuppy");
		// List returns by Arrays.asList is final effectively. Does not support
		// any chnage
		// fixedList.add("1"); //Commenting as UnSupportedOperation
		Integer[] arr = { 1, 3, 5, 7 };
		List<Integer> numList = Arrays.asList(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 2)); // -2
		Collections.sort(numList);
		System.out.println("From Collection:"
				+ Collections.binarySearch(numList, 2));
		// Example of unboxing : Integer to int
		int num = numList.get(0);
	}
}
