package com.ch.exceptionDemo.practice;

//自定义异常类
public class EcDef extends Exception {
	static final long serialVersionUID = -3387511235424229948L;

	public EcDef() {

	}

	public EcDef(String esg) {
		super(esg);
	}
}
