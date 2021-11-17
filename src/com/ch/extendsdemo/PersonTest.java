package com.ch.extendsdemo;

public class PersonTest {

	public static void main(String[] args) {
		// 多态
		// 子类对象赋给父类的引用
		// 编译，看左边。父类引用是否有此方法
		// 运行，右边。实际运行的是子类中重写父类的方法
		Person p1 = new Man();
		p1.eat();
		p1.walk();
		// 不能调用子类特有的方法属性，编译时，p1是Person类型
//		p1.smoking();父类中无此方法，编译不通过

		System.out.println(p1.id);// 多态不适用与属性，只适用于方法
		System.out.println(p1.getId());

		System.out.println("*********************************");

		// 有了多态性后，内存中实际上是加载了子类特有的属性和方法的
		// 但是由于变量声明为父类，导致编译时，只能调用父类中声明的属性和方法，子类特有的不能调用

		// 如何才能调用子类特有的属性和方法？
		// 向下转型,强制类型转换
//		Man m1 = (Man) p1;
//		m1.smoking();

		// 存在转换失败风险 ClassCastException
//		Woman w1 = (Woman) p1;
//		w1.shopping();

		// 为了避免转换异常，在向下转型之前，使用instanceof判断
		/*
		 * a instanceof A :判断对象a是否是类A的实例。如果是，返回true
		 */
		if (p1 instanceof Woman) {
			System.out.println("*********Woman********");
			Woman w1 = (Woman) p1;
			w1.shopping();
		}
		if (p1 instanceof Man) {
			System.out.println("*********Man********");
			Man m1 = (Man) p1;
			m1.smoking();
		}
		if (p1 instanceof Person) {
			System.out.println("*********Person********");
		}
		if (p1 instanceof Object) {
			System.out.println("*********Object********");
		}

		Object obj = new Woman();
		Person p2 = (Person) obj;

	}

}
