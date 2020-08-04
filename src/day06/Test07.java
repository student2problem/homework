package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入要复制的文件名: ");
		String name = console.next();
		Test07 t = new Test07();
		t.copy1(name);
		t.copy2(name);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public void copy1(String name) throws IOException {
		InputStream is = new FileInputStream(name);
		String[] names = name.split(".");
		OutputStream os = new FileOutputStream(names[0]+"_copy"+names[1]);
		int i;
		while ((i=is.read())!=-1){
			os.write(i^13);//异或两次,变回原值
		}
		is.close();
		os.close();
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public void copy2(String name) throws IOException {
		InputStream is = new FileInputStream(name);
		String[] names = name.split(".");
		OutputStream os = new FileOutputStream(names[0]+"_copy"+names[1]);
		byte[] bs = new byte[1024];
		int len;
		while ((len=is.read(bs))!=-1){
			os.write(bs,0,len);
		}
		os.flush();

		os.close();
		is.close();
	}
}
