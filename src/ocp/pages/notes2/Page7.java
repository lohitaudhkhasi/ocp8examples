package ocp.pages.notes2;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class Page7 {
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		String result = pool.invoke(new XTask(2));
		System.out.println(result);
		pool.shutdownNow();
	}
}

class XTask extends RecursiveTask<String> {
	private int index;

	XTask(int index) {
		this.index = index;
	}

	protected String compute() {
		return "Merry Christmas:" + index;
	}
}