package com.ch.innerclassDemo.use2;

public class InnerclassTest {
	// 方法内-局部内部类
	// 开发中很少见
	public void method() {
		class AA {

		}
	}

	// 方法返回一个Comparable接口的实现类的对象
	public Comparable getComparable() {
		// 创建一个实现Comparable接口的类
		// 方式一： 接口有名实现类的匿名对象
		class MyComparable implements Comparable {

			@Override
			public int compareTo(Object o) {
				return 0;
			}

		}
		return new MyComparable();

	}

	public Comparable getComparable2() {
		// 方式二： 接口的匿名实现类的匿名对象
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				return 0;
			}
		};
	}
}
