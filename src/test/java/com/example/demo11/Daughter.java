package com.example.demo11;



public class Daughter extends Father{
	
	public Daughter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Daughter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void shoppint(){
				System.out.println(super.getName()+"在買東西");
	}


}
