package cn.ruiz.stu.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class FileOutPutStremTest {

	static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy年MM月dd日 HH时:mm分",Locale.CHINA);
	
	public static void main(String args[]) {
		System.out.print("HELLO World!\b!");
		System.out.println("\b\b\b\b\b\b\bhellop");
	}

	private static void inputStreamTest() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String buffer = null;
		try {
			while ((buffer = br.readLine())!=null) {
				if (buffer.equals("exit")) {
					System.exit(0);
				}
				System.out.println(buffer);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void fileOperation() {
		File file = new File("bb.text");
		System.out.println("can write "+file.canWrite());
		System.out.println("can read "+file.canRead());
		System.out.println("last modificated :"+simpleDateFormat.format(file.lastModified()));
		System.out.println("size :" + file.length());
		readerFromFile(file);
	}

	private static void readerFromFile(File file) {
		FileReader fileReader = null;
		try {
			 fileReader = new FileReader(file);
			char[] Buffer  = new char[2];
			int hasRead = 0;
			while ((hasRead = fileReader.read(Buffer)) > 0) {
				System.out.println(new String(Buffer,0,hasRead));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void writertoFile(File file) {
		Writer writer = null;
		try {
//			FileOutputStream fos = new FileOutputStream(file);
			 writer = new FileWriter(file);
			writer.write("Hello!!");
			writer.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void printFileName(int i, List<File> fList) {
		for(File file :fList) {
			if (file.isFile()) {
				for(int l=0; l<i; l++) {
					System.out.print("\t");
				}
				System.out.println(file.getName());
			}else if (file.isDirectory()) {
				for(int l=0; l<i; l++) {
					System.out.print("\t");
				}
				System.out.println("/"+file.getName());
				if (file.getName().equals("bin")) {
					continue;
				}
				printFileName(++i, Arrays.asList(file.listFiles()));
			}
		}
	}
	
	
}
