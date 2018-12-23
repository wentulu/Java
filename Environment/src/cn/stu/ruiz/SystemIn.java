package cn.stu.ruiz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TimeZone;

public class SystemIn {

	public static void main(String[] args) {

		String[] ID = TimeZone.getAvailableIDs();
		System.out.println(Arrays.toString(ID));
		
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println("Time Zone ID = "+timeZone.getID());
		
		System.out.println("Time Zone name="+timeZone.getDisplayName());
		
	}

	private static void copyStringtoArr() {
		char[] s1 = {'I',' ','a','x','R'};
		String aString = "12";
		aString.getChars(0, 2, s1, 1);//第二个参数比实际值要大一个，最大为字符串容量
		System.out.println(s1);
	}

	private static void systemLong() {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLong()) {
			System.out.println(scanner.nextLong());
		}
	}

	private static void systemIn(Scanner scanner) {
		
		
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
			
		}
	} 
	
	
}
