package com.ch.exceptionDemo;

public class ThrowTest {

	public static void main(String[] args) {
		Student s = new Student();
		try {
			s.regit(-1001);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);
	}

}

class Student {
	private int id;

	public void regit(int id) throws Exception {
		if (id > 0) {
			this.id = id;
		} else {
			// System.out.println("输入id有误");
			// 手动抛出异常
			// throw new RuntimeException("输入id有误");
			throw new Exception("输入id有误");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

}