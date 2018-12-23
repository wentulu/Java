package cn.ruiz.stu;

public class PrintRunnable implements Runnable {

	
	private static int taskCount=0;
	
	private final int id = taskCount++;
	
	public PrintRunnable() {
		super();
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		
		for(int i=0; i<3; i++) {
			System.out.print("#"+id+"("+i+")\t");
			Thread.currentThread().yield();
		}
		
		System.out.println("#"+id+Thread.currentThread().getName()+"end  \t");

	}

}
