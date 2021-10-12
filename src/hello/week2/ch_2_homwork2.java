package hello.week2;

import java.util.Scanner;
/*
 1.获取RS两位整数
 2.计算强度S：RS%10 
 3.计算可辨度R：RS/10
 4.先根据S输出，逗号空格，再根据R输出
 * */
public class ch_2_homwork2 {
	public static void main(String[] args) {
		int R,S,RS;
		Scanner in = new Scanner(System.in);
		RS=in.nextInt();
		S=RS%10;
		R=RS/10;
//		先根据强度S输出
		switch (S) {
		case 1: {
			System.out.print("Faint signals, barely perceptible");
			break;
		}
		case 2: {
			System.out.print("Very weak signals");
			break;
		}
		case 3: {
			System.out.print("Weak signals");
			break;
		}
		case 4: {
			System.out.print("Fair signals");
			break;
		}
		case 5: {
			System.out.print("Fairly good signals");
			break;
		}
		case 6: {
			System.out.print("Good signals");
			break;
		}
		case 7: {
			System.out.print("Moderately strong signals");
			break;
		}
		case 8: {
			System.out.print("Strong signals");
			break;
		}
		case 9: {
			System.out.print("Extremely strong signals");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + S);
		}
//		打印逗号与空格
		System.out.print(", ");
//		再根据清晰度R输出
		switch (R) {
		case 1: {
			System.out.print("unreadable");
			break;
		}
		case 2: {
			System.out.print("barely readable, occasional words distinguishable");
			break;
		}
		case 3: {
			System.out.print("readable with considerable difficulty");
			break;
		}
		case 4: {
			System.out.print("readable with practically no difficulty");
			break;
		}
		case 5: {
			System.out.print("perfectly readable");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + R);
		}
//		打印句号
		System.out.print(".");
	}
}