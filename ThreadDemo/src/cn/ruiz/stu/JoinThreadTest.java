package cn.ruiz.stu;

public class JoinThreadTest extends Thread{

	private String name;
	
	
	
	public JoinThreadTest(String name) {
		super();
		this.name = name;
	}



	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(name+"=>"+i);
		}
	}
	
	public static void  main(String[] args) {
		
		new JoinThreadTest("新线程").start();
		
		for(int i=0; i<60; i++) {
			if (i==30) {
				JoinThreadTest joinThreadTest = new JoinThreadTest("join 线程");
				joinThreadTest.start();
				try {
					joinThreadTest.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"= "+i);
		}
		
		
	}
	
	
}
