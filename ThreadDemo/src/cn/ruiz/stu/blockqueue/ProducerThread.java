package cn.ruiz.stu.blockqueue;

import java.util.concurrent.BlockingQueue;

import org.w3c.dom.css.CSSUnknownRule;

public class ProducerThread extends Thread {

	private final BlockingQueue<String> blockingQueue;

	public ProducerThread(String name, BlockingQueue<String> products) {
		super(name);
		this.blockingQueue = products;
	}

	String[] product = new String[] { "JAVA", "HTML", "SQL", "C", "C++", "C#", "VB", "OC", "GROVY", "PHP", "PyTHON" };

	@Override
	public void run() {

		try {
			for (int i = 0; i < 20; i++) {
				blockingQueue.put(product[i % 11]);
				System.out.println("存入："+product[i%11]);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
