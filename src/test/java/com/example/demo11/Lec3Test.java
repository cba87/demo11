package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {
	
	@Test
    public void recurrenceTest() {
		System.out.println(this.scoreTest());
	}
	
	/**
	 * 遞迴方法
	 * @param X
	 * @return
	 */
	public int recurrence(int X) {
		//當被拆解到最小問題時,直接回傳答案
		if(X==1) {
			return 1;
		}
		//每一次的答案會是 原本傳進來的參數+以(參數-1)來呼叫此方法的結果
		//程式碼內自己呼叫自己就稱為遞迴
		int sum= X + this.recurrence(X-1);
		//return x+this.recurrence(X-1);//匿名變數寫法(省略SUM
	}
	@Test
	public void ifTest() {
		
		String weather = "下雨";
		
        if(weather == "下雨") {
			System.out.println("帶雨傘");
		}else if(weather =="大太陽") {
		System.out.println("不用帶雨傘");
		}else {
			System.out.println("不用做任何事情");
		}
		
	}
	public double TicketPrice(int age) {
		double price=100;
		
		if(age<=6||age>=80) {
			price=price*0.2;
		}else if(age<=12) {
			price=price*0.5;
		}else if(60<=age) {
			price=price*0.5;
		}
		return price;	
		
		if(age<=6||age>=80) {
			price=price*0.2;
		}
		if(7<=age&&age<=12) {
			price=price*0.5;
		}
		if(60<=age&&age<=79) {
			price=price*0.5;
		}
		return price;	
	}
	
	@Test
	public void scoreTest() {
		Scanner scanner = new Scanner(System.in);
		int trying=scanner.nextInt();
		 String point="";
		switch((trying-60)/10) {
		case 4:
		case 3:
			point="A";
			System.out.println(point);
			break;
		case 2:
			point="B";
			System.out.println(point);
			break;
		case 1:
			point="C";
			System.out.println(point);
			break;
		case 0:
			point="D";
			System.out.println(point);
			break;
		default:
			point="F";
			System.out.println(point);
		}
		scanner.close();
		
	}
	/******隨機生成數字*******
	 * 
	 */Scanner scanner = new Scanner(System.in);//宣告類別:類別名稱 變數名稱 = NEW 類別名稱()
	


}
