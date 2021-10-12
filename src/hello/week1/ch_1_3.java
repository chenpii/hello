package hello.week1;

import java.util.Scanner;

public class ch_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		foot = (int)(30/3.0);
		System.out.println(1.2-1.1);
		Scanner in = new Scanner(System.in);
		foot=in.nextInt();
		inch=in.nextDouble();
		System.out.println(10/3);
		System.out.println("foot:"+foot+";inch:"+inch);
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
	}

}