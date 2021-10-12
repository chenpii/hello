package hello.week5;

import java.util.Scanner;

public class List_5_2_Prime4 {
	/*例子：构造前50个素数
	 * 判断是否能被已知的且<x的素数整除
	 * */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] primes = new int[50];
		primes[0]=2;
		int cnt =1;	//同时目前只有1个素数在primes[]里
					//下次再发现素数，放到primes[cnt]里;
		MAIN_LOOP:
		for(int x=3;cnt<50;x++) {
			//从3开始到50看多少个素数
			//拿已有的素数看x能不能整除它
			for(int i=0;i<cnt;i++) {
				if(x%primes[i]==0) { //如果能被已有的素数整除，说明不是素数；看下一个x
					continue MAIN_LOOP;
				}
			}
			//如果所有的primes[cnt]都走完没有发现，说明是素数，加到primes[cnt]里,然后cnt指向下一个
			primes[cnt++]=x;
//			primes[cnt]=x;
//			cnt++;
		}
		for (int k: primes) {
			System.out.print(k+" ");
		}
	}
}