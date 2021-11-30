package com.ch.exceptionDemo;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class ExceptionTest {
	// ***********************编译时异常**************************
	@Test
	public void test7() {
		File file = new File("hello.txt");
		// FileInputStream fis = new FileInputStream(file);
		//
		// int data = fis.read();
		// while (data != -1) {
		// System.out.print((char) data);
		// data = fis.read();
		// }
		// fis.close();

	}

	// ***********************运行时异常**************************
	// NullPointerException 空指针异常
	@Test
	public void test1() {
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));

	}

	// ArrayIndexOutOfBoundsException 数组下标越界
	@Test
	public void test2() {
		int[] arr = new int[3];
		System.out.println(arr[3]);

	}

	// ClassCastException 类型转换异常
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String) obj;
	}

	// NumberFormatException 数字格式化异常
	@Test
	public void test4() {
		String str = "123";
		str = "abc";
		Integer.parseInt(str);
	}

	// InputMismatchException 输入不匹配异常
	@Test
	public void test5() {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		// 输入字符串
		System.out.println(score);

	}

	// Arithmeticexception 算数异常
	@Test
	public void test6() {
		int a = 4;
		int b = 0;
		// 输入字符串
		System.out.println(a / b);

	}
}
