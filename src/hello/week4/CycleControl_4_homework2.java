package hello.week4;

import java.util.Scanner;

public class CycleControl_4_homework2 {
	/*
	 * 念整数
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int n; // 每一位的数
		int length = 0; // number的长度
		int onumber = Math.abs(number);

		// 负的情况
		if (number < 0) {
			System.out.print("fu ");
			number = -number;
		}
		// 获得长度length
		do {
			n = number % 10;
			number /= 10;
			length++;
		} while (number > 0);

		// 根据长度从左至右获得每一位
		for (int i = length; i > 0; i--) {
			n = onumber / (int) (Math.pow(10, i - 1));
			onumber = onumber - (int) (Math.pow(10, i - 1)) * n;
			switch (n) {
			case 1:
				System.out.print("yi");
				break;
			case 2:
				System.out.print("er");
				break;
			case 3:
				System.out.print("san");
				break;
			case 4:
				System.out.print("si");
				break;
			case 5:
				System.out.print("wu");
				break;
			case 6:
				System.out.print("liu");
				break;
			case 7:
				System.out.print("qi");
				break;
			case 8:
				System.out.print("ba");
				break;
			case 9:
				System.out.print("jiu");
				break;
			case 0:
				System.out.print("ling");
				break;
			default:
				break;
			}
			// 如果不是最后一个，打印空格
			if (i != 1) {
				System.out.print(" ");
			}
		}
	}
}