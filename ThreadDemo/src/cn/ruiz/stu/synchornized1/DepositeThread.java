package cn.ruiz.stu.synchornized1;

public class DepositeThread extends Thread{

	
	private int amount;
	private Account account;
	
	
	public DepositeThread(String name,Account account,int amount) {
		super(name);
		this.amount = amount;
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
//			System.out.println(getName()+"准备存钱");
			account.deposite(amount);
//			System.out.println(getName()+"存钱成功，交易完成");
		}
		
	}
	
	
	
}
