package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;


public class HomeWork3 {
	@Test
	public void numberTest1() {
		String number = "\\(\\d{2}\\)\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���ܸ��X (�ϽX2�X)-�Ʀr7or8�X");
		String inputNumber = scan.next();
		boolean check = inputNumber.matches(number);
		if(check) {
			System.out.println("�q�ܸ��X�ŦX�榡");
		}else {
			System.out.println("�q�ܸ��X���ŦX�榡");
		}
		scan.close();
	}
	@Test
	public void numberTest2() {
		String number = "\\d{2}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���ܸ��X �ϽX2�X-�Ʀr7or8�X");
		String inputNumber = scan.next();
		boolean check = inputNumber.matches(number);
		if(check) {
			System.out.println("�q�ܸ��X�ŦX�榡");
		}else {
			System.out.println("�q�ܸ��X���ŦX�榡");
		}
		scan.close();
	}
	@Test
	public void numberTest3() {		
//		System.out.println("******");
		String Number = "0\\d{1,3}-\\d{7,8}";
//		System.out.println("******");
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���ܸ��X �ϽX0+�W�Ʀr2-3�X-�Ʀr7-8�X");
		String inputNumber = scan.next();
		boolean check = inputNumber.matches(Number);
		if(check) {
			System.out.println("�q�ܸ��X�ŦX�榡");
		}else {
			System.out.println("�q�ܸ��X���ŦX�榡");
		}
		scan.close();
	}

}
