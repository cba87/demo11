package com.example.demo11;

import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {
	public static void scoreTest(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(97)+2;

		Scanner scanner = new Scanner(System.in);
		int number;
		int max = 99;
		int min = 1;
		for (;;) {
			number = scanner.nextInt();			
			if (number > randomNumber) {
				if (number < max) {
					max = number;
         			}
				System.out.println("�п�J�U�C�d��Ʀr");
				System.out.printf("%d<randomNumber<%d", min, max);
			}
			if (number < randomNumber) {
				if (min < number) {
					min = number;
				}
				System.out.println("�п�J�U�C�d��Ʀr");
				System.out.printf("%d<randomNumber<%d", min, max);
			}
			if (number == randomNumber) {
				System.out.printf("���G");
				break;
			}
		}
		scanner.close();

	}

}
