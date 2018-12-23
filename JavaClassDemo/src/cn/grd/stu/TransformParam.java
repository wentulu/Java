package cn.grd.stu;

public class TransformParam {

	
	
	public void testPackaged(Integer a, Double b) {
		
		a = 12;
		b = 89d;
		
	}
	
	public void test(Integer a, Double b) {
		a = Integer.valueOf(89);
		b = Double.valueOf(90);
		System.out.println("Method a="+a.hashCode()+"  b="+b.hashCode());
	}
	
	public void testUnpackaged(int a,double c) {
		a = 23;
		c = 12;
	}
	
}
