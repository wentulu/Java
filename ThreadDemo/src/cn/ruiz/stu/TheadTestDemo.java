package cn.ruiz.stu;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class TheadTestDemo {

//	public static void main(String[] args) {
		
		
//		CallableTest aCallableTest = new CallableTest();
//		FutureTask<Integer> futureTask = new FutureTask<>(aCallableTest);
//		new Thread(futureTask).start();
//		try {
//			System.out.println(futureTask.get());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			TimeUnit.SECONDS.sleep(1);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			System.out.println("start");
//			System.out.println(futureTask.get());
//			System.out.println("end");
//			System.out.println(futureTask.get());
//		
//		} catch (InterruptedException e) {
//			System.out.println(e.toString());
//		} catch (ExecutionException e) {
//			System.out.println(e.toString());
//			e.printStackTrace();
//		}

//	}

	private static void daemon() {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new DaemonTest());
			thread.setDaemon(true);
			thread.start();
		}
		try {
			TimeUnit.NANOSECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void ecector() {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
//				newFixedThreadPool(3);
//				newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new PrintRunnable());
		}

		executorService.shutdown();
	}

}
