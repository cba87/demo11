package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Bird extends Animal{
//�ϥ�extend ���~��Animal�����ݩʤΤ�k
//1.�ݩ�name �H�Φs���p���ݩʪ�getter/setter ��k
//2.eat,sleep ��k
//�H�W���ݩʤΤ�k�bAnimal ���� �A���ݭn�A���g�@�� 	
	//�غc��k
	//�w�]�غc��k(�S���Ѽƪ��غc��k)
	public Bird() {
		//�b�I�s�l���O���غc��k���e�A�|���I�s�����O���غc��k
		//���ެO�w�]�غc��k�٬O�a���Ѽƪ��غc��k
		//�Y�Ϯ����I�s�����O��super()��k�A�{���٬O�|���I�s�����O���غc��k
		super();
		System.out.println("�o�O�l���O");
	}
	

	//bird��name�Mage�~�Ӧۤ����O��Anamal�A�ҥH�a��name�Mage���غc��k�|�h�I�s�����O���غc��k
	public Bird(String string, int i) {
		super(string, i);
		// TODO Auto-generated constructor stub
	}
	//�i�z�L����rsuper �ӨϥΩw�q�b�����O��public��k
	//�ݩ�Name���v���Oprivate�A�u��bAnimal���O���ϥ�
	public void flying() {
		System.out.println(super.getName()+"�n���h�[!");
		System.out.println(getName()+"�n���h�[!");
		//�ثeJava�������i�H�N����rsuper�ٲ�
	}
	public void flying2() {
		//�]���ݩ� age �v���Oprotected�A�ҥH�l���O�i�H�����s�����ݩ�		
		System.out.println("���~"+age+"��"+getName()+"�n���h�[!");

	}
	//1.�l���O�i�H���s�w�q(���P��@���e)�����O����k
	//2.@Override �N�O�ΨӼаO�l���O���s�w�q�����O����k:�ثe��Java�����A���`���i�H�ٲ��A��ĳ�[
	//2.1@�OAnnotation,�`��:�|�b�{���X�����ѰT���A�o�ǰT���|�b�sĶ�άO����ɳQ�B�z
	//3�l���O���s�w�q����k:
	//  3.1�v�����i������O�p
	//  3.2�^�Ǫ���ƫ��A�n�@��
	//  3.3��k�W�٩M�p�A�������ѼƭӼƭn�@��
	//  3.4�ߤ@�����P�N�O�j�A��������@���e
	@Override
	public void eat() {
		System.out.println(getName()+"�Y����");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"�Ϋܦh");
	}
	@Test
	public void playball2(){

		HomeTown hometown = new HomeTown("�x�n","�x�W","�w�n��");
		
		Employee employee = new Employee("1213546","�Ѥ�",18,"�k",hometown);
		
		System.out.println("=====");
		
		System.out.println(employee.toString());
		
		}
	
}