package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {
	
	@Test
    public void recurrenceTest() {
		System.out.println(this.scoreTest());
	}
	
	/**
	 * ���j��k
	 * @param X
	 * @return
	 */
	public int recurrence(int X) {
		//��Q��Ѩ�̤p���D��,�����^�ǵ���
		if(X==1) {
			return 1;
		}
		//�C�@�������׷|�O �쥻�Ƕi�Ӫ��Ѽ�+�H(�Ѽ�-1)�өI�s����k�����G
		//�{���X���ۤv�I�s�ۤv�N�٬����j
		int sum= X + this.recurrence(X-1);
		//return x+this.recurrence(X-1);//�ΦW�ܼƼg�k(�ٲ�SUM
	}
	@Test
	public void ifTest() {
		
		String weather = "�U�B";
		
        if(weather == "�U�B") {
			System.out.println("�a�B��");
		}else if(weather =="�j�Ӷ�") {
		System.out.println("���αa�B��");
		}else {
			System.out.println("���ΰ�����Ʊ�");
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
	/******�H���ͦ��Ʀr*******
	 * 
	 */Scanner scanner = new Scanner(System.in);//�ŧi���O:���O�W�� �ܼƦW�� = NEW ���O�W��()
	


}
