package cn.ruiz.stu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest extends Object{
	private String  aString ="疯狂Java讲义";
	private String bString = "疯狂Android讲义";
	private String cString = "轻量级JavaEE";
	private String dString = "abc";
	
	public void test() {
		
		
		Collection collection = new ArrayList();
		collection.add(aString);
		System.out.println("c .size="+collection.size());
		collection.add(bString);
		System.out.println("c = "+collection);
		collection.add(dString);
		collection.add(cString);
		
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()) {
			String str = (String) iterator.next();
			if (str.equals(bString)) {
				collection.remove(str);//会抛出异常  ConcurrentModificationException
				//迭代其中不可以修改值
			}
		}
		
	}
	
}
