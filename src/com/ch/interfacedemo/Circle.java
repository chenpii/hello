package com.ch.interfaceDemo;

/*
 * 定义一个Circle类，声明radius属性，提供get set方法
 */
public class Circle {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
