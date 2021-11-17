package com.ch.javabean;

/*
 * JavaBean是一种Java语言写成的可重用组建
 * 符合以下标准的Java类
 * 1.类是公用的
 * 2.有个无参公共构造器
 * 3.有属性，且有对应的get set方法
 * 
 */
public class Customer {
	private int id;
	private String name;

	public Customer() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
