package com.ch.exceptionDemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {
	public static void main(String[] args) {
		OverrideTest overridetest = new OverrideTest();
		SubClass subclass = new SubClass();
		overridetest.show(subclass);
	}

	public void show(SuperClass s) {
		try {
			s.method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class SuperClass {
	public void method() throws IOException {

	}

}

class SubClass extends SuperClass {

	@Override
	public void method() throws FileNotFoundException {

	}

}