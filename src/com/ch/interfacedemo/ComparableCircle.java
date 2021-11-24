package com.ch.interfaceDemo;

/*
 * 定义ComparableCircle类，继承Circle，实现CompareObject接口
 * 实现compartTo方法体，用来比较两个圆的半径大小
 */
public class ComparableCircle extends Circle implements CompareObject {

	@Override
	public int compartTo(Object o) {
		if (this == o) {
			return 0;
		}

		if (o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle) o;
//			精度损失，存在误判 2.3-2.1 = 0
//			return (int) (this.getRadius() - c.getRadius());

			if (this.getRadius() > c.getRadius()) {
				return 1;
			} else if (this.getRadius() < c.getRadius()) {
				return -1;
			} else {
				return 0;
			}

		} else {
			throw new RuntimeException("传入的类型有误");
		}

	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	public ComparableCircle() {
		super();
	}

}
