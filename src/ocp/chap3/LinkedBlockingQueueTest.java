package ocp.chap3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {
	public static void main(String[] args) {
		BlockingQueue<Integer> bcqueue = new LinkedBlockingQueue();
		try {
			bcqueue.put(null);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Integer intVar = null;
		intVar = bcqueue.poll();
		System.out.println("hello:" + intVar);
		try {
			intVar = bcqueue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Item removed:" + intVar);
	}

}
