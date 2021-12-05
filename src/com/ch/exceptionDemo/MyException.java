package com.ch.exceptionDemo;

public class MyException extends RuntimeException {

	static final long serialVersionUID = -7034812390745766939L;

	public MyException() {

	}

	public MyException(String msg) {
		super(msg);
	}
}
