package hello.week3;

import java.util.Scanner;

public class Loop_3_homework2 {
	/*数字奇偶特征值
	 * 对于一个整数，从个位开始对每一位数字编号，个位是1号，十位是2号，以此类推。
	 * 这个整数在第n位上的数字记作x，如果x和n的奇偶性相同，则记下一个1，否则记下一个0。
	 * 按照整数的顺序把对应位的表示奇偶性的0和1都记录下来，就形成了一个二进制数字。
	 * 比如，对于342315，这个二进制数字就是001101
	 * 按照二进制位值将1的位的位值加起来就得到了结果13
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number; 	//输入的数字
		int x;			//每一位的数字
		int count=0;	//数位
		int result=0; 	//输出值
		number = in.nextInt();
		while(number>0){
			x=number%10;
			count++;
			if((x+count)%2==0){ //数字跟数位都是偶数或者奇数情况下，相加等于偶数
				result=result+(int)(Math.pow(2,count-1));
			}
			number=number/10;
		}
		System.out.print(result);
	}

}
