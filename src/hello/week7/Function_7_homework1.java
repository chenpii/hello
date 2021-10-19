package hello.week7;

import java.util.Scanner;

/* 【分解质因数】
 * 题目内容：
 * 每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，这几个素数就都叫做这个合数的质因数。
 * 比如，6可以被分解为2x3，
 * 而24可以被分解为2x2x2x3。
 * 现在，你的程序要读入一个[2,100000]范围内的整数，然后输出它的质因数分解式；当读到的就是素数时，输出它本身。
 * 
 * 输入格式:
 * 一个整数，范围在[2,100000]内。
 * 
 * 输出格式：
 * 形如：
 * n=axbxcxd
 * 或
 * n=n
 * 所有的符号之间都没有空格，x是小写字母x。
 * 
 * 输入样例：
 * 18
 * 输出样例：
 * 18=2x3x3
 * 
 * 解题思路：
 * 1.构造一个函数
 * boonlean isPrime 返回是否是素数
 * 
 * 2.读入一个数n，判断是否是素数
 * 是素数，返回本身;
 * 不是素数，从2开始到根号2循环
 * 	当i是素数且n%i==0
 * 	打印ix;
 * 	n=n/i;
 *	break;
 * */
public class Function_7_homework1 {

	// 判断素数
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		if (n == 2) {
			return isPrime;
		}
		for (int i = 2; i < Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.print(number + "=");
		while (!isPrime(number)) {
			for (int i = 2; i < number; i++) {
				// 如果i是素数且能被number整除
				if ((isPrime(i)) && ((number % i) == 0)) {
					System.out.print(i + "x");
					number = number / i;
					break;
				}
			}
		}
		System.out.print(number);
	}
}