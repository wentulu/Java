package cn.ruiz.stu;

public class ThreadRunnabletest extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 0; i < 100; i++) {

				System.out.println(Thread.currentThread().getName() + " ====>" + i);
				// 直接使用getName()和使用Thread.currentThread().getName();获取到的名字不一样
				// getName()获取到的是-1
				// Thread.currentThread().getName()获取的是main
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("异常");
		}

	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		ThreadRunnabletest threadRunnabletest = new ThreadRunnabletest();
//		threadRunnabletest.run();¬
		for (int i = 0; i < 30; i++) {
			if (i == 15) {
				threadRunnabletest.start();
				try {
					sleep(1l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}

	}

}
