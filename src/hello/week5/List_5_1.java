package hello.week5;


public class List_5_1 {
	/*
	 * 数组 数组变量是管理者，不是所有者 数组变量赋值是赋予管理权
	 */
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a;
		b[0] = 6;

		System.out.println(a == b);
		System.out.println(a[0]);
	}
}