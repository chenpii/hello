package hello.week3;

import java.util.Scanner;

public class ch_3_homework1 {
/*奇偶个数
 * 
 * 输入格式:
 * 一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
 * 输出格式：
 * 两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。
 * 两个整数之间以空格分隔。
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int number;		//输入的数
		int oddcount=0;	//奇数的个数
		int evencount=0; //偶数的个数
		number=in.nextInt();
		while(number!=-1){
			if(number%2==0){
				evencount++;
			}else if (number%2==1) {
				oddcount++;
			}
			number=in.nextInt();
		}
		System.out.println(oddcount+" "+evencount);
	}
}
