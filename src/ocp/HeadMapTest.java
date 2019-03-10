package ocp;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class HeadMapTest extends Xabs {
	public static void main(String[] args) {
		NavigableMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("aaa", "111");
		treeMap.put("aab", "111");
		treeMap.put("aac", "111");
		treeMap.put("aad", "111");
		System.out.println(treeMap.headMap("aac"));
		System.out.println(treeMap.tailMap("aab"));

	}

	@Override
	protected static void m() {
		// TODO Auto-generated method stub

	}
}

abstract class Xabs {
	abstract protected void m();
}