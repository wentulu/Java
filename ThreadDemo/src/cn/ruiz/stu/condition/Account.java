package cn.ruiz.stu.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	
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

	public void draw(int amount) {

		lock.lock();
		try {
			if (!flag) {
				condition.await();
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
				condition.signalAll();
//			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("yichang quqian");
		}finally {
			lock.unlock();
		}

		System.out.println("draw end");
	}

	public void deposite(int amount) {
		lock.lock();
		try {
			if (flag) {
				condition.await();
				System.out.println("no poc");
			} 
//			else {
				
				balance += amount;
				System.out.println("存款成功，余额：" + balance);
				flag = true;
				System.out.println(flag);
				condition.signalAll();
//			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("yichang cunqian");
		}finally {
			System.out.println("deposite end");
			lock.unlock();
		}
		
	}

}
