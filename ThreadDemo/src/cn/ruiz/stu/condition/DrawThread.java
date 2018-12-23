package cn.ruiz.stu.condition;

public class DrawThread extends Thread{
	
	
	private Account account;
	private int amount;
	
	/**
	 * 
	 * */
	public DrawThread(String name,Account account,int amount) {
		super(name);
		this.account = account;
		this.amount = amount;
		
	}

	@Override
	public void run() {
		for(int i=0; i<6; i++) {
//			System.out.println(getName()+"准备取钱");
			account.draw(amount);
//			System.out.println(getName()+"取钱交易完成");
		}
	}
	
}
