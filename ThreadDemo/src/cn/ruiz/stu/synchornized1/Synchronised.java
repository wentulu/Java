package cn.ruiz.stu.synchornized1;

public class Synchronised {

	public static void main(String[] args) {
		
		Account account = new Account(System.currentTimeMillis(), 0);
		
		new DrawThread("Lee", account, 100).start();
		new DepositeThread("Bob", account, 100).start();
		
	}
	
	
}
