package com.ch.extendsdemo;

public class Woman extends Person {
	public int id = 1003;
	private int age;
	private String name;

	public Woman(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Woman() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("女人吃饭少");
	}

	public void walk() {
		System.out.println("女人走路慢");
	}

	public void shopping() {
		System.out.println("女人购物");
	}
}
