package hello.week2;

import java.util.Scanner;

/*
 * 
 * 如1124表示11点24分，而905表示9点5分，36表示0点36分，7表示0点7分。
 有效的输入范围是0到2359，即你的程序不可能从测试服务器读到0到2359以外的输入数据。
 你的程序要输出这个时间对应的UTC时间，输出的格式和输入的相同，即输出一个整数，表示UTC的时和分。
 整数的个位和十位表示分，百位和千位表示小时。
 如果小时小于10，则没有千位部分；
 如果小时是0，则没有百位部分；
 如果分小于10分，需要保留十位上的0。
 提醒：要小心跨日的换算。

 思路：
 1.获取整数型BJT
 2.计算UTC
 如果BJT>=800,说明不跨日，UTC=BJT-800
 如果BJT<800,说明跨日，UTC=2400-(800-BJT)
 3.输出UTC
 * */
public class Judge_2_homwork1 {
	public static void main(String[] args) {
		int BJT, UTC;
		// 获取BJT
		Scanner in = new Scanner(System.in);
		BJT = in.nextInt();
		// 计算UTC
		if (BJT >= 800) {
			UTC = BJT - 800;
		} else {
			UTC = 1600 + BJT;
		}
		// 输出UTC
		System.out.print(UTC);
	}
}