package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

public class RegexTest {
	
	@Test
	public void test0() {
		
		// \�Ÿ��L�k��W�s�b
		// \�AJAVA����ܸ���Ÿ��A�ΨӸ��榳�S��N�q���Ÿ�-->�����S��N�q���Ÿ��ܦ���ª��r��
		// \\ -->�Ĥ@�Ӹ���Ÿ��O���ĤG�Ӹ���Ÿ��q���S��N�q�ܦ���ª��r��
		String pattern = "\\";
		System.out.println(pattern);
		
	}
	@Test
	public void test1() {
		//��������X�榡:�Ʀr4�X-�Ʀr3�X-�Ʀr3�X
				// \d ��ܼƦr0-9�����N�䤤�@��
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		//�ϥΤj�A��{}�B�zpattern�����ƥX�{���r��
		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		//�W�@�� -\\d{3}���ƥX�{�F�⦸�A-\\d{3}�O�]�t�F-,\\d,{3}�o3�Ӧr��
		//�ҥH�ݭn�Τp�A���N�o3�Ӧr��ئ��P�@��(-\\d{3})�A�A�Τj�A���B�z���Ƴ���
		String pattern2 = "\\d{4}(-\\d{3}){2})";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J������X:�榡�� �Ʀr4�X-�Ʀr3�X-�Ʀr3�X");
		String input = scan.next();
		
		
		if(input.matches(pattern)) {//check == true
			System.out.println(input+"�ŦX������X�榡!!");
		}else{
			System.out.println(input+"���ŦX������X�榡!!");
		}
//		System.out.println(pattern);
	
	//===================
	//�W����input.matches(pattern)�����G���ܼ�Check���^��
	//���b���򪺵{���X���A�ܼ�CHECK�u�ϥΤF�@��
	//�ҥH�i�H�ϥΰΦW(���ݭn���ܼƨӱ��p�⪺���G)���覡�ӧ�g
	    if(input.matches(pattern)) {//check == true
		System.out.println(input+"�ŦX������X�榡!!");
	    }else{
		System.out.println(input+"���ŦX������X�榡!!");
	    }
	}
	@Test
	public void test2(){
		//���ܮ榡1:�Ʀr��X-�Ʀr7�X
		String pattern1 = "\\d{2}-\\d{7}";
		//���ܮ榡1:(�Ʀr��X)-�Ʀr7�X
	    String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���ܸ��X:�榡�� �Ʀr2�X-�Ʀr7�X �άO (�Ʀr2�X)-�Ʀr7�X");
		String input = scan.next();
		if(input.matches(pattern1)||input.matches(pattern2)) {
			System.out.println(input + "�ŦX���ܸ��X�榡!!");
		}else {
			System.out.println(input + "���ŦX���ܸ��X�榡!!");
		}
		//=====================
		//�X��pattern1��pattern2
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if(input.matches(pattern3)) {
			System.out.println(input + "�ŦX���ܸ��X�榡!!");
		}else {
			System.out.println(input + "���ŦX���ܸ��X�榡!!");
		} 
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
		if(input.matches(pattern4)) {
			System.out.println(input + "�ŦX���ܸ��X�榡!!");
		}else {
			System.out.println(input + "���ŦX���ܸ��X�榡!!");
		}
	}
	public void test3(){
		//���ܮ榡:�Ʀr2�X-�Ʀr7�X��8�X
		String pattren = "\\d{2}-(\\d{7}|\\d{8})";
		//\\d{7,8}:���\\d�ܤ֥X�{7���A�ܦh�X�{8��
		String pattren1 = "\\\\d{2}-\\d{7,8}";
	}
	@Test
	public void test4() {
		String pattren = "A-CSW-Z";//�ŦX���r����: A,B,C,S,W,��,��,Z
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
		System.out.println("�п�J���ܸ��X �ϽX0+�W�Ʀr2-3�X(���i��0)-�Ʀr7-8�X");
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
	public void numberTest4() {		
//		System.out.println("******");
		String number = "[[A-Z]|[a-z]][1-2]\\d{8}";
		String number1 = "[A-Za-z&&[^ABDEFHabdefgh]][1-2]\\d{8}";
		String number2 = "[\\w&&[^ABDEFHabdefgh0-9_]][1-2]\\\\d{8}";
//		System.out.println("******");
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����Ҧr�� �j�g�^��+�W�Ʀr9�X");
		String inputNumber = scan.next();		
		boolean check = inputNumber.matches(number);
		if(inputNumber.length()<10) {
			System.out.println("�����Ҧr�����פ���");
			scan.close();
		    return;
		}		
		if(check) {
			System.out.println("�����Ҧr���ŦX�榡");
		}else {
			System.out.println("�����Ҧr�����ŦX�榡");
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
