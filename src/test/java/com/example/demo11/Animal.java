package com.example.demo11;

public class Animal {

	private String name;

	protected int age;

	// �غc��k
	public Animal() {
		super();
		//�غc��k���Y���I�s�����O super()��k�A���ެO�w�]�٬O���a�Ѽƪ��غc��k
		//��l���{���X���u��g�bsuper()��k����
		System.out.println("�o�O�����O");
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "�٦b�Y!!�n�h�D");
	}

	public void sleep() {
		System.out.println(name + "�٦b��!!���ڰ_�ɶ�");
	}
}
