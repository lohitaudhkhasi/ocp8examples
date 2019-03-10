package ocp.chap7;

import java.lang.Thread.State;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class WeighAnimalTest extends RecursiveAction {

	private int start;

	public WeighAnimalTest(int start, int end, Double[] weights) {
		super();
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	private int end;
	private Double[] weights;

	@Override
	protected void compute() {
		if (end - start < 3) {
			for (int i = start; i < end; i++) {
				weights[i] = (double) (new Random()).nextInt(100);
				System.out.println("Animal weighted:" + i);
			}
		} else {
			int middle = start + (end - start) / 2;
			System.out.println("[start=" + start + ",middle=" + middle
					+ ",end=" + end);
			invokeAll(new WeighAnimalTest(start, middle, weights),
					new WeighAnimalTest(middle, end, weights));
		}
	}

	public static void main(String args[]) {
		Double[] weights = new Double[10];
		ForkJoinTask<?> task = new WeighAnimalTest(0, weights.length, weights);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		System.out.println("Weight:");
		Arrays.asList(weights).stream().forEachOrdered(System.out::println);
	}
}
