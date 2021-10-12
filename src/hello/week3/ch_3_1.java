package hello.week3;

import java.util.Scanner;

public class ch_3_1 {
	public static void main(String[] args) {
//		初始化
		Scanner in = new Scanner(System.in);
		int number ;
		int sum= 0 ;
		int count= 0 ;
		number = in.nextInt();
		while(number!=-1) {
			sum+=number;
			count++;
			number = in.nextInt();
			System.out.println("count:"+count);
		}
		System.out.println("平均数："+sum/count);
	}
}