package hello.week6;

import java.util.Scanner;

public class Object_6_1 {
	/*字符对象
	 * 切换大小写
	 * Unicode编码
	 * 大写字母在前，小写字母在后
	 * */
	public static void main(String[] args) {
		char single = 'R';
		char singleChange ;
		single = (char)(single+('a'-'A'));
		System.out.println(single);
		System.out.println((int)('a'));
		System.out.println((int)('z'));
		System.out.println((int)('A'));
		System.out.println((int)('Z'));
	}
}