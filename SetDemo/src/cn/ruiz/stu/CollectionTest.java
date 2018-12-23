package cn.ruiz.stu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	
	
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
		
		Collection books = new HashSet();
		books.add(aString);
		System.out.println("books .size="+collection.size());
		books.add(bString);
		System.out.println("books = "+books);
		books.add(cString);
		
		System.out.println("===c = "+collection);
		System.out.println("===books = "+books);
		collection.retainAll(books);
		System.out.println("c =" + collection);
		
	}
	
	
}
