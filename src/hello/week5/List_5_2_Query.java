package hello.week5;

import java.util.Scanner;

public class List_5_2_Query {
	/*
	 * 数组中查找某一元素
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] data = { 3, 2, 5, 7, 4, 9, 11, 34, 12, 28 };
		int x = in.nextInt();
		int loc = -1;

		// for循环
		for (int i = 0; i < data.length; i++) {
			if (x == data[i]) {
				loc = i;
				break;
			}
		}
		if (loc > -1) {
			System.out.println(x + "是第" + (loc + 1) + "个");
		} else {
			System.out.println("没找到" + x);
		}

		/*
		 * for-each循环， 优点：方便遍历 缺点：不知道每个元素的位置
		 */
		boolean found = false;
		for (int k : data) { // 对于数组data中的每一个元素，循环每一列，拿出来赋值给k
			if (k == x) {
				found = true;
				break;
			}
		}
	}
}