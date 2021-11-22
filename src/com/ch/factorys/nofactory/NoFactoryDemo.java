package com.ch.factorys.nofactory;

/*
 * 无工厂模式
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

public class NoFactoryDemo {

	public static void main(String[] args) {
		Car a = new Audi();
		Car b = new Audi();
		a.run();
		b.run();

	}

}
