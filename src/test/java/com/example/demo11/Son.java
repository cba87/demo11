package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Son extends Father{
	
	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Test
	public void playball(){
		System.out.println(super.getName()+"ª±­Ó²y");
	}

}

