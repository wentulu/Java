package cn.ruiz.stu.condition;


public class ConditionTest {

	
	public static void main(String[] args) {
		Account account = new Account(90098978978l, 0);
		new DrawThread("Bob", account, 100).start();
		new DepositeThread("Lee", account, 100).start();
	}
	
}
