package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

public class RegexTest {
	
	@Test
	public void test0() {
		
		// \符號無法單獨存在
		// \再JAVA中表示跳脫符號，用來跳脫有特殊意義的符號-->讓有特殊意義的符號變成單純的字串
		// \\ -->第一個跳脫符號是讓第二個跳脫符號從有特殊意義變成單純的字串
		String pattern = "\\";
		System.out.println(pattern);
		
	}
	@Test
	public void test1() {
		//比對手機號碼格式:數字4碼-數字3碼-數字3碼
				// \d 表示數字0-9的任意其中一個
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		//使用大括號{}處理pattern中重複出現的字串
		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		//上一行 -\\d{3}重複出現了兩次，-\\d{3}是包含了-,\\d,{3}這3個字串
		//所以需要用小括號將這3個字串框成同一組(-\\d{3})，再用大括號處理重複部分
		String pattern2 = "\\d{4}(-\\d{3}){2})";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼:格式為 數字4碼-數字3碼-數字3碼");
		String input = scan.next();
		
		
		if(input.matches(pattern)) {//check == true
			System.out.println(input+"符合手機號碼格式!!");
		}else{
			System.out.println(input+"不符合手機號碼格式!!");
		}
//		System.out.println(pattern);
	
	//===================
	//上面的input.matches(pattern)的結果用變數Check接回來
	//但在後續的程式碼中，變數CHECK只使用了一次
	//所以可以使用匿名(不需要用變數來接計算的結果)的方式來改寫
	    if(input.matches(pattern)) {//check == true
		System.out.println(input+"符合手機號碼格式!!");
	    }else{
		System.out.println(input+"不符合手機號碼格式!!");
	    }
	}
	@Test
	public void test2(){
		//市話格式1:數字兩碼-數字7碼
		String pattern1 = "\\d{2}-\\d{7}";
		//市話格式1:(數字兩碼)-數字7碼
	    String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼:格式為 數字2碼-數字7碼 或是 (數字2碼)-數字7碼");
		String input = scan.next();
		if(input.matches(pattern1)||input.matches(pattern2)) {
			System.out.println(input + "符合市話號碼格式!!");
		}else {
			System.out.println(input + "不符合市話號碼格式!!");
		}
		//=====================
		//合併pattern1跟pattern2
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if(input.matches(pattern3)) {
			System.out.println(input + "符合市話號碼格式!!");
		}else {
			System.out.println(input + "不符合市話號碼格式!!");
		} 
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
		if(input.matches(pattern4)) {
			System.out.println(input + "符合市話號碼格式!!");
		}else {
			System.out.println(input + "不符合市話號碼格式!!");
		}
	}
	public void test3(){
		//市話格式:數字2碼-數字7碼或8碼
		String pattren = "\\d{2}-(\\d{7}|\\d{8})";
		//\\d{7,8}:表示\\d至少出現7次，至多出現8次
		String pattren1 = "\\\\d{2}-\\d{7,8}";
	}
	@Test
	public void test4() {
		String pattren = "A-CSW-Z";//符合的字母有: A,B,C,S,W,Ｘ,Ｙ,Z
		String str = "_";
		System.out.println(str.matches(pattren));
		String str1 = "\n";
				

	}
	@Test
	public void numberTest3() {		
//		System.out.println("******");
		String number = "0[1-9]{1,3}-\\d{7,8}";
//		System.out.println("******");
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼 區碼0+上數字2-3碼(不可為0)-數字7-8碼");
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
	public void numberTest4() {		
//		System.out.println("******");
		String number = "[[A-Z]|[a-z]][1-2]\\d{8}";
		String number1 = "[A-Za-z&&[^ABDEFHabdefgh]][1-2]\\d{8}";
		String number2 = "[\\w&&[^ABDEFHabdefgh0-9_]][1-2]\\\\d{8}";
//		System.out.println("******");
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入身份證字號 大寫英文+上數字9碼");
		String inputNumber = scan.next();		
		boolean check = inputNumber.matches(number);
		if(inputNumber.length()<10) {
			System.out.println("身份證字號長度不足");
			scan.close();
		    return;
		}		
		if(check) {
			System.out.println("身份證字號符合格式");
		}else {
			System.out.println("身份證字號不符合格式");
		}
		scan.close();
	}
	@Test
	public void running() {
		Human human = new Human();
		Human person = new Person();
		Human car = new Car();
		
		human.run();
		person.run();
		car.run();

	}
	

}
