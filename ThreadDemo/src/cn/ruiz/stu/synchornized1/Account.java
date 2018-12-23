package cn.ruiz.stu.synchornized1;

public class Account {

	private long accountNumber;
	private int balance;

	private boolean flag = false;//

	public Account(long accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public synchronized void draw(int amount) {

		try {
			if (!flag) {
				wait();
				System.out.println("no money");
			} 
//			else {
				
			
				if (amount <= balance) {
					balance -= amount;
					System.out.println("取钱成功:" + amount);
				} else {
					System.out.println("取钱失败 剩余余额: " + balance);
				}
				flag = false;
				System.out.println(flag);
				notifyAll();
//			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("yichang quqian");
		}

		System.out.println("draw end");
	}

	public synchronized void deposite(int amount) {
		try {
			if (flag) {
				wait();
				System.out.println("no poc");
			} 
//			else {
				
				balance += amount;
				System.out.println("存款成功，余额：" + balance);
				flag = true;
				System.out.println(flag);
				notifyAll();
//			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("yichang cunqian");
		}
		System.out.println("deposite end");
	}

}
