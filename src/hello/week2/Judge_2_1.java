package hello.week2;

import java.util.Scanner;

public class Judge_2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		初始化
		Scanner in = new Scanner(System.in);
//		读入投币金额
		System.out.print("请投币：");
		int amount;
		amount=in.nextInt();
		System.out.println("票价：10元");
//		计算并找零
		if(amount>=10) {
			System.out.println("找零："+(amount-10));
		}else {
			System.out.println("钱不够");
		}
		
	}
}