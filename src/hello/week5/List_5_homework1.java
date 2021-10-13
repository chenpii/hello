package hello.week5;

import java.util.Scanner;
/*
题目内容：
一个多项式可以表达为x的各次幂与系数乘积的和，比如：
2x6+3x5+12x3+6x+20
现在，你的程序要读入两个多项式，然后输出这两个多项式的和，也就是把对应的幂上的系数相加然后输出。
程序要处理的幂最大为100。

输入格式:
总共要输入两个多项式，每个多项式的输入格式如下：
每行输入两个数字，第一个表示幂次，第二个表示该幂次的系数，所有的系数都是整数。第一行一定是最高幂，最后一行一定是0次幂。
注意第一行和最后一行之间不一定按照幂次降低顺序排列；如果某个幂次的系数为0，就不出现在输入数据中了；0次幂的系数为0时还是会出现在输入数据中。

输出格式：
从最高幂开始依次降到0幂，如：
2x6+3x5+12x3-6x+20
注意其中的x是小写字母x，而且所有的符号之间都没有空格，如果某个幂的系数为0则不需要有那项。

输入样例：
6 2
5 3
3 12
1 6
0 20
6 2
5 3
2 12
1 6
0 20

输出样例：
4x6+6x5+12x3+12x2+12x+40

解题思路:
1.先初始化长度为101的数组 a 
int[] a =new int[101]

2.用坐标表示幂，元素表示系数
0  1 2 3 4 5 6 .....100
[][][][][][][].....[]

3.输入。第1个数为坐标i，第2个数赋值给a[i],把a[i]相加,一直到遇到第2个0幂次
0 1 2 3 4 5 6 .....100
[][][][][][][].....[]
20 6 0 12 0 3 2
20 6 12 0 0 3 2
相加之后
40 12 12 12 0 6 4

4.输出数组。从最后一个往前遍历。
	如果元素（系数）==0 不输出
	
	如果元素（系数）==1
		如果坐标大于1
			输出"x"+i
		如果坐标等于1
			输出"x"
		如果坐标等于0
			输出a[i]
		往前找第一个不是0的元素，如果它大于0，输出+。负的不用判断
		
	如果元素（系数）==-1
		如果坐标大于1
			输出"-x"+i
		如果坐标等于1
			输出"-x"
		如果坐标等于0
			输出a[i]
		往前找第一个不是0的元素，如果它大于0，输出+。负的不用判断
		
	如果元素（系数）！=0 且！=+-1
		如果坐标大于1
			输出a[i]+"x"+i
		如果坐标等于1
			输出a[i]+"x"
		如果坐标等于0
			输出a[i]
		往前找第一个不是0的元素，如果它大于0，输出+。负的不用判断

*/
public class List_5_homework1 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] a =new int[101];
		int power; 	//幂次--数组的下标
		int co;		//系数--数组的元素
		int count=0;
		
		//写入数组，数组坐标power表示幂，元素co表示系数；
		//将co加到a[power]
		//直到遇见第二个0；
		do{
			power=in.nextInt();
			co=in.nextInt();
			a[power]+=co;
			if(power==0){
				count++;
			}
		}while(count!=2);
		
		for(int i=(a.length-1);i>=0;i--){
			if(a[i]==1) {
				if(i>1){
					System.out.print("x"+i);
				}else if(i==1){
					System.out.print("x");
				}else if(i==0){
					System.out.print(a[i]);
				}
				for(int k = i-1;k>=0;k--){
					if(a[k]!=0){
						if(a[k]>0) {
							System.out.print("+");
						}
						break;
					}
				}
			}else if(a[i]==-1) {
				if(i>1){
					System.out.print("-x"+i);
				}else if(i==1){
					System.out.print("-x");
				}else if(i==0){
					System.out.print(a[i]);
				}
				for(int k = i-1;k>=0;k--){
					if(a[k]!=0){
						if(a[k]>0) {
							System.out.print("+");
						}
						break;
					}
				}
			}else if(a[i]!=0){
				if(i>1){
					System.out.print(a[i]+"x"+i);
				}else if(i==1){
					System.out.print(a[i]+"x");
				}else if(i==0){
					System.out.print(a[i]);
				}
				for(int k = i-1;k>=0;k--){
					if(a[k]!=0){
						if(a[k]>0) {
							System.out.print("+");
						}
						break;
					}
				}
			}
		}
	}
}