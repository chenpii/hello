package com.ch.exceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExceptionTest {

	public void method2() throws IOException {
		method();
	}

	public void method() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		File file = new File("hello.txt");
		fis = new FileInputStream(file);
		int data = fis.read();
		while (data != -1) {
			System.out.print((char) data);
			data = fis.read();

		}
	}
}
