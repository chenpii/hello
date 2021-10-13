package hello.week5;

import java.util.Scanner;

public class List_5_homework1 {
	/*两个多项式之和
	 * */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] a =new int[101];
		int power; 	//幂次
		int co;		//系数
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
		
		for(int i=(a.length-1);i>-1;i--){
			//如果元素不为0，输出
			if(a[i]!=0){
				//如果坐标大于1，输出元素+x+坐标
				if(i>1){
					System.out.print(a[i]+"x"+i);
					//如果后面第一个不是0的元素大于0，输出+
					for(int k = i-1;k>0;k--){
						if(a[k]!=0){
							if(a[0]>0){
								System.out.print("+");
							}
							break;
						}
					}
				//如果坐标等于1，输出元素+x
				}else if(i==1){
					System.out.print(a[i]+"x");
				//如果坐标等于0，输出元素
				}else if(i==0){
					if(a[i]>0){
						System.out.print("+");
					}
					System.out.print(a[i]);
				}
			}
		}
	}
}


