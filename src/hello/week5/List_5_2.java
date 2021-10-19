package hello.week5;

import java.util.Scanner;

public class List_5_2 {
	/*
	 * 数组
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sum = 0;
		int cnt = 0;
		cnt = in.nextInt();
		if (cnt > 0) {
			int[] numbers = new int[cnt];
			for (int i = 0; i < cnt; i++) {
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			double average = sum / cnt;
			System.out.println("平均数：" + average);
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > average) {
					System.out.println("大于平均数的有：" + numbers[i]);
				}
			}
		}
	}
}