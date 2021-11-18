package com.ch.wrapper;

import org.junit.Test;

public class WrapperTest {
	@Test
	public void test1() {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);
	}

	@Test
	public void test2() {
		Object o2;
		if (true) {
			o2 = new Integer(1);
		} else {
			o2 = new Double(2.0);
		}
		System.out.println(o2);
	}

	@Test
	public void test3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j); // false 比较地址

		Integer m = 127;// 自动装箱,底层有一个
						// Integer内部定义了个 Integer cache[]
						// 存着[-128,127]，在这范围内的数字自动从里面获取

		Integer n = 127;
		System.out.println(m == n);// true

		Integer x = 128;// 超过[-128,127]之后，new 一个对象
		Integer y = 128;
		System.out.println(x == y);// false

	}
}
