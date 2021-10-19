package hello.week4;

import java.util.Scanner;

public class CycleControl_4_homework1 {
	/*
	 * 素数和 给定两个整数n和m，0<n<=m<=200 你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
	 * 注意，是第n个素数到第m个素数之间的所有的素数，并不是n和m之间的所有的素数。
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int number = 1; // 判断是否为素数的数字
		int sum = 0; // 素数和
		int count = 0; // 第count个素数

		while (count < m) {
			number++;
			// 判断number是不是素数
			boolean flag = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
			// 为素数的情况下，计数加1，值求和
			if (flag) {
				count++;
				if (count >= n && count <= m) {
					sum += number;
				}
			}
		}
		System.out.println(sum);

	}
}
