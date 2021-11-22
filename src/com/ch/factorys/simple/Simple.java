package com.ch.factorys.simple;

/*
 * 简单工厂模式
 */

interface Car {
	void run();
}

class Audi implements Car {

	@Override
	public void run() {
		System.out.println("奥迪在跑");

	}

}

class BYD implements Car {

	@Override
	public void run() {
		System.out.println("比亚迪在跑");

	}

}

//工厂类
class CarFactory {
	// 方式一
	public static Car getCar(String type) {
		if ("奥迪".equals(type)) {
			return new Audi();
		} else if ("比亚迪".equals(type)) {
			return new BYD();
		} else {
			return null;
		}
	}

	// 方式二
	public static Car getAudi() {
		return new Audi();
	}

	public static Car getBYD() {
		return new BYD();
	}

}

//调用者
public class Simple {
	public static void main(String[] args) {
		Car a = CarFactory.getCar("奥迪");
		a.run();
		Car b = CarFactory.getCar("比亚迪");
		b.run();
	}

}
