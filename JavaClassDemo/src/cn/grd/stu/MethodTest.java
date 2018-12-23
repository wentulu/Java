package cn.grd.stu;

import java.lang.ref.WeakReference;

public class MethodTest {

	
	public static void main(String[] args) {
		
		String aString = new String("hghghghghg");
		WeakReference<String> weakReference = new WeakReference<String>(aString);
		aString = null;
		
		System.out.println(weakReference.get());
		
		 Runtime.getRuntime().gc();
		 
		 System.out.println(weakReference.get());
		
		
	}

	private static void packed() {
		Integer a = 1;
		Double b = 2d;
		System.out.println("a="+a.hashCode()+"  b="+b.hashCode());
		TransformParam param = new TransformParam();
		param.test(a, b);
		System.out.println("a="+a.hashCode()+"  b="+b.hashCode());
	}
	
}
