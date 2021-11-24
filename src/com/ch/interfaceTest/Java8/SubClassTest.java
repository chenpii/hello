package com.ch.interfaceTest.Java8;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
//		接口的静态方法只能用接口调用
//		s.method1();
		CompareA.method1();

		s.method2();

		// 如果子类/实现类，继承的父类和实现的接口中声明了同名同参数的方法，且子类没有重写此方法的情况下，默认调用的是父类的方法
		s.method3();
	}
}

class SubClass extends SuperClass implements CompareA, CompareB {

	@Override
	public void method2() {
		System.out.println("SubClass:上海");
	}

	@Override
	public void method3() {
		System.out.println("SubClass:杭州");
	}

	public void mymethod() {
		// 调用自己的method3
		this.method3();
		// 调用父类中声明的
		super.method3();
		// 调用接口中的默认方法
		CompareA.super.method3();
		CompareB.super.method3();
	}

}