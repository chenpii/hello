package com.ch.exceptionDemo;

public class ThrowTest {

	public static void main(String[] args) {
		Student s = new Student();
		try {
			s.regist(-1001);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Student {
	private int id;

	public void regist(int id) throws Exception {
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