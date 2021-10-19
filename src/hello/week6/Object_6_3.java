package hello.week6;

import java.util.Scanner;

public class Object_6_3 {
	/*
	 * 字符串操作 字符串是对象，对它的所有操作都是通过. 进行的 字符串.操作 它表示对.左边的这个字符串做右边的操作
	 * 这里的字符串可以是变量，也可以是常量
	 * 
	 * 1.String大小的比较(Unicode) comparteTo() 两个字符串可以比较大小 s1.comparteTo(s2)
	 * s1<s2小，结果是负的 s1=s2，结果是0 s1>s2，结果是正的 compareToIgnoreCase 不区分大小写来比较大小
	 * 
	 * 2.获得String的长度 length() s1="hello" s1.length()=5 s1="" s1.length()=0
	 * String s1; s1.length() 报错
	 * 
	 * 3.访问String里的字符 s.charAt(index) 返回在index上的单个字符 index范围是0-(length()-1)
	 * 第一个字符的index是0，跟数组一样 但是不能用for-each来循环遍历字符串
	 * 
	 * 4.得到子串 s.substring(n); 得到从n号位置到末尾的全部内容 s.substring(b,e) 得到从b号位置到e号位置之前的内容
	 * 
	 * 5.寻找字符 s.indexOf(c) 得到c字符所在的位置，不存在返回-1 s.indexOf(c,n) 从n号位置开始寻找c字符
	 * s.indexOf(t) 找到字符串t所在的位置
	 * 
	 * 从右边开始找 s.lastIndexOf(c) s.lastIndexOf(c,n) s.lastIndexOf(t) 6.其他操作
	 * s.startsWith(t) 是否以某字符串开头 s.endsWith(t) 是否以某字符串结尾 s.trim() 将字符串两端空格去掉
	 * s.replace(c1,c2) 将c1换成c2 s.toLowerCase() 把字母都换成小写 s.toUpperCase()
	 * 把字母都换成大写
	 * 
	 * 注意：所有的操作不会改变字符串本身，都是新建一个字符串将操作的结果存起来
	 * 
	 * 7.可以在switch-case中使用字符串 switch(s){ case"this":...break;
	 * case"that":...break; }
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = "abc";
		String s2 = "ab";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i) + " ");
		}

		System.out.println("======================");

		String s3 = "01234567839汉字";
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(2, 4)); // 返回第2、3位置
		System.out.println(s3.indexOf('4')); // 查找'4'字符所在位置
		System.out.println(s3.indexOf("9汉字")); // 字符串"9汉字"在第9个位置
		// 找第二个3
		int loc = s3.indexOf('3');
		System.out.println(s3.indexOf('3', loc + 1));

		System.out.println("======================");

		String s4 = " abcDEF ";
		System.out.println(s4.startsWith(" ab"));
		System.out.println(s4.endsWith("EF "));
		System.out.println(s4.trim());
		System.out.println(s4.replace('D', '哈'));
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());

		System.out.println("======================");

		String s5 = "hello";
		switch (s5) {
		case "hello":
			System.out.println("yes");
			break;
		case "world":
			System.out.println("no");
			break;
		default:
			break;
		}
	}
}