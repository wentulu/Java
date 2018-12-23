package cn.ruiz.stu;

import java.util.concurrent.ThreadFactory;
/**
 * 
 * 一个在使用Executor的时候用来生成Thread的工厂类
 * */
public class DaemonThreadFactory implements ThreadFactory{

	@Override
	public Thread newThread(Runnable r) {
		
		return null;
	}

}
