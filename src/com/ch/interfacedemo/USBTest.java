package com.ch.interfacedemo;

public class USBTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		// 1.创建接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		computer.trancsferData(flash);

		// 2.创建接口的非匿名实现类的匿名对象
		computer.trancsferData(new Printer());

		// 3.创建接口的匿名实现类的非匿名对象
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("手机开启工作");

			}

			@Override
			public void stop() {
				System.out.println("手机结束工作");

			}

		};
		computer.trancsferData(phone);

		// 4.创建接口的匿名实现类的匿名对象
		computer.trancsferData(new USB() {

			@Override
			public void start() {
				System.out.println("MP4开启工作");

			}

			@Override
			public void stop() {
				System.out.println("MP4结束工作");

			}

		});

	}

}

class Computer {

	public void trancsferData(USB usb) {// 声明的是USB，传的是具体实现类
										// USB usb = new Flash();
										// 体现接口的多态性
		usb.start();
		System.out.println("开始传输数据");
		usb.stop();
	}
}

interface USB {
	void start();

	void stop();
}

class Flash implements USB {

	@Override
	public void start() {
		System.out.println("U盘开启工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘停止工作");
	}

}

class Printer implements USB {

	@Override
	public void start() {
		System.out.println("打印机开启工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机停止工作");
	}

}
