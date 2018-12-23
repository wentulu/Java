package cn.ruiz.stu.blockqueue;

import java.util.concurrent.BlockingQueue;

public class CustomerThread extends Thread{

	private final BlockingQueue<String> blockingQueue;
	
	public CustomerThread(String name,BlockingQueue<String> products) {
		super(name);
		this.blockingQueue = products;
	}
	
	
	@Override
	public void run() {

		try {
			for(int i = 0; i<20;i++) {
				String product = blockingQueue.take();
				System.out.println("消费了"+product);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
