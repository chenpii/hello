package com.ch.interfacedemo;

public class ComparableCircleTest {

	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(3.4);
		ComparableCircle c2 = new ComparableCircle(3.5);
		Circle c3 = new Circle(3.0);
		System.out.println(c1.compartTo(c2));
		System.out.println(c1.compartTo(c3));

	}

}
