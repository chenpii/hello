package com.ch.interfaceDemo.factorys.method;

/*
 * 工厂方法模式
 * 
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

// 工厂接口
interface Factory {
	Car getCar();
}

// 两个工厂类
class AudiFactory implements Factory {

	@Override
	public Car getCar() {

		return new Audi();
	}

}

class BYDFactory implements Factory {

	@Override
	public Car getCar() {
		return new BYD();
	}

}

// 调用者
public class FactoryMethod {

	public static void main(String[] args) {
		Car a = new AudiFactory().getCar();
		Car b = new BYDFactory().getCar();
		a.run();
		b.run();
	}

}
