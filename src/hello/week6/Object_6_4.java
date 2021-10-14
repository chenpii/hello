package hello.week6;

import java.util.Scanner;

public class Object_6_4 {
	/*字符串变量
	 * 跟数组变量一样，是管理者，不是所有者
	 * String a;
	 * String b;
	 * a=b 意思为a b共同管理同一个字符串
	 * 
	 * 比较两个String
	 * a.equals(b) 	比较内容是否相同 
	 * a==b 		比较是不是管理同一个字符串
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s= new String("Hello");
		System.out.println(s+12); 		//把12变成1 2 两个字符
		System.out.println(s+12+24);	//Hello1224，加号从左向右做，s+12计算结果是string，再跟24计算，最后结果还是字符串
		System.out.println(s+(12+24));	//Hello36
		
		String s2;
		s2= in.next();		//读一个词，分隔符是空格包括tab \t 回车
		s2= in.nextLine();	//读一行
		
	}
}