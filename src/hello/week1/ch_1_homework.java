package hello.week1;

import java.util.Scanner;

public class ch_1_homework {
/*
 * 写一个将华氏温度转换成摄氏温度的程序，转换的公式是：°F = *°C + 32
 * 其中C表示摄氏温度，F表示华氏温度。C=(F-32)/(9/5)
 * 程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。
 * 提示，为了把计算结果的浮点数转换成整数，需要使用下面的表达式：
 * (int)x;
 * 其中x是要转换的那个浮点数。
 * 
 * */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Cdegree ; //摄氏温度
		int Fdegree ; //华氏温度
		Scanner in = new Scanner(System.in);
		Fdegree=in.nextInt();
		Cdegree=(int)((Fdegree-32)/(9/5.0));
		System.out.print(Cdegree);
	}

}