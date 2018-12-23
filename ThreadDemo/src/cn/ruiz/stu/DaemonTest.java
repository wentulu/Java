package cn.ruiz.stu;

import java.util.concurrent.CountDownLatch;

/**
 * 设置为后台线程在主线程方法运行结束的时候结束
 * 
 * */

public class DaemonTest implements Runnable{

	
	private int count = 0;
	@Override
	public void run() {

		while (true) {
			System.out.print(Thread.currentThread().getName()+"  "+count+++"\n");
			
		}
		
	}
}
