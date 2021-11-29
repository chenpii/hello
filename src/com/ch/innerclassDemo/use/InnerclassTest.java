package com.ch.innerclassDemo.use;

/*
 * 1.将A声明在B类中，A为内部类，B为外部类
 * 
 * 2.分类：
 * 		成员内部类（静态、非静态）
 * 		局部内部类（方法内、代码内、构造器内）
 * 
 * 3.成员内部类
 * 		作为外部类的成员
 * 			>调用外部类的结构
 * 			>可以被static
 * 			>可以被4种权限修饰符修饰
 * 
 * 		作为一个类
 * 			>可以定义属性、方法、构造器等
 * 			>可以被final修饰，表示此类不能被继承。
 * 			>可以被abstract修饰
 * 
 * 4.关注以下3个问题
 * 	1.如何实例化成员内部类的对象
 * 	2.如何在成员内部类中区分调用外部类的结构
 * 	3.开发中局部内部类的使用
 */
public class InnerclassTest {
	public static void main(String[] args) {
		// 创建Dog实例（静态成员内部类）
		Person.Dog dog = new Person.Dog();
		dog.show();
		// 创建Bird实例（非静态成员内部类）
		Person p = new Person();
		Person.Bird bird = p.new Bird();
		bird.Sing();

		// 调用内部类方法
		bird.display("黄鹂");
	}

}

class Person {
	String name = "小明";
	int age;

	public void eat() {
		System.out.println("人，吃饭");
	}

	// 静态成员内部类
	static class Dog {
		String name;
		int age;

		public void show() {
			System.out.println("卡拉是条狗");
		}

	}

	// 非静态成员内部类
	class Bird {
		String name = "杜鹃";

		public void Sing() {
			System.out.println("小鸟在唱歌");
			Person.this.eat();// 调用外部类的非静态属性
		}

		public void display(String name) {
			// 方法的形参
			System.out.println(name);
			// 内部类Bird的属性
			System.out.println(this.name);
			// 外部类Person的属性
			System.out.println(Person.this.name);
		}
	}

	// 构造器内-局部内部类
	public Person() {
		class AA {

		}
	}

	// 代码块内-局部内部类
	{
		class BB {
		}
	}

	// 方法内-局部内部类
	public void method() {

		class CC {

		}
	}

}
