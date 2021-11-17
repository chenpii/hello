package com.ch.javabean;

/*
 * 创建Circle类，提供私有的radius属性
 * 提供相应的get set方法，提供求圆面积的方法
 */
public class Circle {
	private double radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 求圆面积方法
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
