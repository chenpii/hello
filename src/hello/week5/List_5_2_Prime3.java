package hello.week5;

import java.util.Scanner;

public class List_5_2_Prime3 {
	/*例子：构造n以内（不含）的素数表
	 * 
	 * 1.令x=2
	 * 2.将2x、3x、4x直至ax<n的数都标记为非素数
	 * 3.令x为下一个没有被标记为非素数的数，重复2；直到所有的数都已经尝试完毕
	 * 
	 * 算法实现：
	 * 1.创造prime为boolean[n],初始化其所有元素为true,prime[x]为true表示x是素数
	 * 2.令x=2
	 * 3.如果x是素数，则对于（i=2;x*i<n;i++） 把所有的prime[x*i]改成false
	 * 4.令x++，如果x<n,重复3，否则结束
	 * */
	public static void main(String[] args) {
//		构造100以内的素数表
		boolean[] primes = new boolean[100];
		for(int i =2;i<primes.length;i++) {
			primes[i]=true;
		}
		for(int i =2;i<primes.length;i++) {
			if(primes[i]) {
				for(int k=2;k*i<primes.length;k++) {
					primes[k*i]=false;
				}
			}
		}
		
		for(int i =2;i<primes.length;i++) {
			if(primes[i]) {
				System.out.print(i+" ");
			}
		}
	}
}