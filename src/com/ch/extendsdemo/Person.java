package com.ch.extendsdemo;

public class Person {
	public int id = 1001;
	private int age;
	private String name;

	public Person() {
	}

	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
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
		System.out.println("人吃饭");
	}

	public void walk() {
		System.out.println("人走路");
	}
}
