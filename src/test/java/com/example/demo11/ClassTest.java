package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	@Test
	public void dogTest() {
		//�ϥ�����r new �إ߹��
		Dog myDog = new Dog();
		//�]�w�C�ӹ�Ҥ��P���ݩ�(�S��)
		myDog.category = "�L�L";
		myDog.color = "�L����";
		myDog.name = "�Q��1��3";
		myDog.age = 2;
		
		System.out.println("�����~��:"+myDog.category);
		System.out.println("�ڮa������v:"+myDog.color);
		//=============
		//�ϥΤ�k(�欰)
		myDog.eat("�魫1��3");
	}
	@Test
	public void bankTest(){
		Bank bank = new Bank();
		bank.setUser("AAA");
		bank.setBalance(1000);
//		mybank.branch = "TTA����";
//		mybank.user = "AAA";
// 		mybank.balance = 1000;
		
		
		//�s��
//		bank.saving(500);
		bank.withdraw(2000);
		
		
	}
	
	@Test
	public void stringTest() {
		String str = "ABC";
		String str1 = "ABC";
		String str2 = new String ("ABC");
		String str3 = str2;
		//==���@��1����򥻸�ƫ��A����
	    //      2������O���O�����m
		
	}
	@Test
	/**
	 * �Ѽƥi�H�ϥ����O �|�ǤJ�O�����m �i�H�ϥθ����O���ݩʤΤ�k
	 * 
	 * @param bank
	 */
	public void stringTest(Bank bank) {
		 bank.saving(500);
	}
	public void stringTest(String branch,String user) {
		//�]�i�H�����a�J���O�����ݩ� �N���αq�O�����m�����X�ݩ�
	}
	public Bank withdraw2(String branch) {
		return new Bank();
	}//�^�Ǫ���ƫ��A�i�H�O���O ���L�nnew�~�i�^��
	public void stringTest3(int branch,String ...user) {
		//�i�ܰѼ� �|�N�ӰѼ��ഫ���}�C  ���L�u���b()�̥k�� �ӥB�u�঳�@��
		System.out.println();
		System.out.println();
		System.out.println();
		return;
	}
	public void bankTest2() {
		Bank bank = new Bank();
		bank.setBalance(1000);
		bank.setUser("AAA");
		bank.setBranch("TTA");
//===============================
		Bank bank1 = new Bank("TTB","BBB",2000);
		
	}
	@Test
	public void stringTest() {
		//withdraw31�O�R�A��k,�i�H�����z�L���O�W��.�R�A��k�I�s
		//withdraw3�O�@���k�A�����n��NEW�X�ӫ�~�i�I�s
	}
	@Test
	public void stringTest3() {
		String str ="ABCADAQW";
		String newStr = str.replace("A","Z");
		String newStr1 = str.replaceAll("A", "Z");
		System.out.println(newStr);
		System.out.println(newStr1);
		
		String newStr2 = str.replaceAll("[A-C]", "Z");
		System.out.println(newStr2);
		
		String newStr3 = str.replace("[A-C]", "Z");
		System.out.println(newStr3);
		}
	@Test
	public void interfaceTest() {
		MyInterface my = new MyInterfaceImpl();
		System.out.println(my.NUM);
		System.out.println(MyInterface.NUM);
	}
}
