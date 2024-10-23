package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;


public class HomeWork3 {
	@Test
	public void numberTest1() {
		String number = "\\(\\d{2}\\)\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼 (區碼2碼)-數字7or8碼");
		String inputNumber = scan.next();
		boolean check = inputNumber.matches(number);
		if(check) {
			System.out.println("電話號碼符合格式");
		}else {
			System.out.println("電話號碼不符合格式");
		}
		scan.close();
	}
	@Test
	public void numberTest2() {
		String number = "\\d{2}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼 區碼2碼-數字7or8碼");
		String inputNumber = scan.next();
		boolean check = inputNumber.matches(number);
		if(check) {
			System.out.println("電話號碼符合格式");
		}else {
			System.out.println("電話號碼不符合格式");
		}
		scan.close();
	}
	@Test
	public void numberTest3() {		
//		System.out.println("******");
		String Number = "0\\d{1,3}-\\d{7,8}";
//		System.out.println("******");
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼 區碼0+上數字2-3碼-數字7-8碼");
		String inputNumber = scan.next();
		boolean check = inputNumber.matches(Number);
		if(check) {
			System.out.println("電話號碼符合格式");
		}else {
			System.out.println("電話號碼不符合格式");
		}
		scan.close();
	}

}
