package cn.ruiz.stu;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallableTest implements Callable<Integer>{

	
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		TimeUnit.MILLISECONDS.sleep(5000);
		return 200;
	}
	
	
}
