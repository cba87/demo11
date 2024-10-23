package com.example.demo11;

public class PersonInfo extends BankTest{
	
	
	private String city;
	
	private int age;

	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonInfo(String city, int age) {
		super();
		this.city = city;
		this.age = age;
	}
	public BankTest getBankTest() {
		return bankTest;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}
	

	
	
	
}
