package com.ch.innerclassDemo.use;

/*
 * 1.将A声明在B类中，A为内部类，B为外部类
 * 
 * 2.分类：
 * 		成员内部类（静态、非静态）
 * 				
 * 
 * 		局部内部类（方法内、代码内、构造器内）
 * 
 * 3.成员内部类
 * 		作为外部类的成员
 * 
 * 		作为一个类
 * 
 */
public class InnerclassTest {

}

class Zoom {
	// 成员内部类
	class Dog {

	}

	// 静态成员内部类
	static class Cat {

	}

	// 局部内部类
	class AA {

	}

	{
		// 局部内部类
		class BB {
		}
	}

	// 局部内部类
	public Zoom() {
		class CC {

		}
	}
}
