package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec2Test {
	
	@Test
	public void reviewLes1() {
		int a;
		String b="1111";
		System.out.println(b);
	}
	//單行註解
	/*多行註解
	 * 
	 */
	/**文件註解
	 * 
	 */
	public String fileCommentTest(int test) {
		return null;
	}
	@Test
	public void computeTest() {
		
		int a=10;
		System.out.println(a);
		System.out.println(a++*10);
		System.out.println(a);
		
		System.out.println("******");
		
		a=10;
		System.out.println(a);
		System.out.println(++a*10);
		System.out.println(a);
		
		
	}
	@Test
	public void Homework() {
		int a=5;
		int b=7;
		System.out.println(a+=9);
		System.out.println(a--);
    	System.out.println(a*=5);
		System.out.println(a=b/5);
		System.out.println(a%=b);
		System.out.println(a=b%a);
		boolean res1=(1!=1);
		boolean res2 = (1==1);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res1&&res2);
		System.out.println(res1||res2);
	}
	@Test
	public void Firework() {
		int a=this.function(1,100);//呼叫方法
		int b=this.Function1(25);
		double c=this.Function2(77);
		int d=this.Function3(i);
		System.out.println(a+"  "+b);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	/**
	 * 
	 * @param start
	 * @param end
	 * @return 公式帶入後的數值
	 */
	public int function(int start,int end) {
	int sum =(start+end)*(end/2);
	return sum;
	
	}
	/**
	 * 
	 * @param 攝氏溫度
	 * @return 華氏溫度
	 */
	public int Function1(int start) {
		int sum =(start*9)/5+32;
		return sum;
		
		}
	/**
	 * 
	 * @param 華氏溫度
	 * @return 攝氏溫度
	 */
	public double Function2(int start) {
		double sum =((start-32)*5)/9;
		return sum;
		
		}
	@Test
	public void forlooptest() {
		System.out.println(this.whileloop4(100));
	}
	@Test
	public void forloop() {
		int sum;
		for(int i=1;i<=9;i++) {
			for(int r=1;r<=9;r++) {
				sum=i*r;
//				System.out.println(i+"x"+r);
				System.out.print(i+"x"+r+"="+sum+" ");
//				System.out.printf("%dx%d=%2d  ",r, i,sum);
			}
//			System.out.println();
			System.out.printf("\n");
		}
	}
	public int whileloop(int a) {
		int sum=0;
		int i=1;
		while(i<=a) {
			sum+=i;
			i++;
			
		}
		return sum;
	}
	@Test
	public void whileloop2() {
		int sum;
		int i=1;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				sum=i*j;
				System.out.printf("%dx%d=%2d  ",i, j,sum);
				j++;
			}
			System.out.printf("\n");
			i++;
		}
		
		
		
	}
	public int whileloop4(int a) {
		int sum=0;
		int i=1;
		do {
			sum+=i;
			i++;
			
		}while(i<=a);
		return sum;
	}
	@Test
	public void infiniteForLoop() {
		int i=1;
		for(;;) {
			i++;
			if(i==1) {
				break;
			}
		}
	}
	@Test
	public void nestedLoopBreakTest() {
		a:for(int i=0;i<10;i+=2) {   //幫迴圈加上標籤名稱，只需要在迴圈前面加上{標籤名稱:}
			System.out.println(i);
			for(int j=0;j<10;j+=2) {
				System.out.println(j);
				break ;//預設會對最近的迴圈作用，故會跳出J的迴圈
				break a;//若要對外層迴圈作用，須在外層迴圈加上標籤，在註明此標籤
			}
			System.out.println("內層已結束");
		}
		System.out.println("外層已結束");
	}
	//遞迴
	
	
}