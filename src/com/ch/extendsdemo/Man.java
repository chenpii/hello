package com.ch.extendsdemo;

public class Man extends Person {
	public int id = 1002;
	private int age;
	private String name;

	public Man(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Man() {

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
		System.out.println("男人吃饭多");
	}

	public void walk() {
		System.out.println("男人走路快");
	}

	public void smoking() {
		System.out.println("男人抽烟");
	}
}
