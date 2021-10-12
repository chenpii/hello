package hello.week5;

import java.util.Scanner;

public class List_5_2_Prime2 {
	/*例子：判断素数
	 * 只要循环sqrt(x)遍
	 * 从n->n/2->sqrt(n)
	 * */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int x = in.nextInt();
		boolean isPrime=true;
		
		if(x==1 || x%2==0 && x!=2) {
			isPrime=false;
		}else {
			for (int i=3; i<=Math.sqrt(x);i+=2) {
				if(x%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(x+"是素数");
		}else {
			System.out.println(x+"不是素数");
		}
	}
}