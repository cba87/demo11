package com.example.demo11;

//���������N�O�@�ө�H������A�ҥH����rabstract�i���i�L
//���㪺�g�k�O:public abstract interface
//�����O��H����L�k�ϥ�����r new �ӥͦ����
public interface MyInterface {
	//�w�q�b���������ݩ�
	//1.�v���u��Opublic �άOnomodifier
	//2.�����n����l��
	int NUM = 10;
	public int NUM2 = 10;

	//3.���㪺�g�k(�άO�Q�sĶ�᪺�g�k)�p�U
	//4.�]���Q�w�q��final�O�`�� �ҥH�ܼƦW�٭n���j�g�A�J�줣�P���^��r���n�Ω��u�걵
	public static final int NUMBER = 10;

	//�]�������O�@�ө�H������A�ҥH�w�q�̭�����k���O��H��k
	//�u�O����rabstract �@�˥i�H�ٲ� :public abstract void fly();
	public void fly();
	
	public void flying();
	
	//�������i�H���w�]����k��@���e(���j�A��)�A���@�w�n�[�W����r default
	//�w�]��k���j��@�w�n���s�w�q
	public default void flying(String name) {
		System.out.println(name+"~~��");
	};
	
	//�w�q�b��������static��k�A�@�w�n��@���e
	//static ��k�L�k�Q���s���w�q
	public static void flying2(String name) {
		System.out.println(name+"~~��");
	};

}