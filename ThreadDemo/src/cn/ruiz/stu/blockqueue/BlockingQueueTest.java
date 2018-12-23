package cn.ruiz.stu.blockqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		
		BlockingQueue< String> blockingQueue = new ArrayBlockingQueue<>(1);
		
		new ProducerThread("pro", blockingQueue).start();
		new CustomerThread("Cus", blockingQueue).start();
		
	}
	
	
}
