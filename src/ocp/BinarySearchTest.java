package ocp;

import java.util.Arrays;

public class BinarySearchTest {
	static String[] sa = { "a", "aa", "aaa", "aaaa" };
	static {
		Arrays.sort(sa);
	}

	public static void main(String[] args) {
		String search = "";
		if (args.length != 0)
			search = args[0];
		System.out.println(Arrays.binarySearch(sa, search));
	}
}
