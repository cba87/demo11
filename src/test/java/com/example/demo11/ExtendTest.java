package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendTest {

	@Test
	public void animalTest() {
		Animal ani = new Animal();
		ani.setName("�Q��1��3");
		ani.eat();
		ani.sleep();
	}

	@Test
	public void animalTest2() {
		Animal ani = new Animal("ani", 5);
		ani.setName("�Q��1��3");
		ani.eat();
		ani.sleep();
	}

	@Test
	public void birdTest() {
		Bird bri = new Bird();
		bri.setName("�Q��1��3");
		bri.eat();
		bri.sleep();
	}

	@Test
	public void birdTest2() {
		Bird bri = new Bird("BIRD", 5);
		bri.setName("�Q��1��3");
		bri.eat();
		bri.sleep();
	}

	@Test
	public void test() {
		int a = 1;
		System.out.println(a++);
	}

	@Test
	public void test2() {
		Father father = new Father("��");
		father.walking();
		Son son = new Son("�j����l");
		son.playball();
		Daughter daughter = new Daughter("�p����l");
		daughter.shoppint();
	}

	public void birdtest() {
		// ���M���^�Ӫ���ƫ��A�O�����O�A���]��new�X�Ӫ���ҬO�l���O�A�ҥH����W�N�O�l���O
		Animal bird = new Bird("Bird", 5);
		// eat��sleep���檺�|�O�l���O�w�q����@���e
		bird.eat();
		bird.sleep();
		// �H�U2�Ӥ�k�L�k�Q�I�s�A�]���S���Q�w�q�b�����O��
		// bird.flying
		// ��X�H�W�A��s�إߥX�Ӫ��l���O��������ƫ��A�O�����O��
		// 1.�u��I�s�w�q�b�����O������k
		// 2.��l���O�����s�w�q���O����k�ɡA���檺�|�O�l���O����@���e
	}

	@Test
	public void birdTest4() {
		Bird bird = new Bird("bird", 5);
		// ���檺�O�w�q�bBird������@���e
		bird.flying();
		// ���s�w�qflying()����k
		// 1.�b�إ߷s����Үɪ��������s����@���e
		// 2.�j�A���n�g�b�������e�B�����@�w�n������
		// 3.���s�w�q����@���e�N�Ȧ��b�o������
		// 4.@Override �i���i�L�A����ĳ�[
		Bird bird2 = new Bird("bird", 5) {

			@Override
			public void flying() {
				System.out.println("�³��C��");
			}

		};

	}

}
