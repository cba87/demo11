package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Father {
	private String name = "��";
	
	
	public Father(String name) {
		super();
		this.name = name;
	}


	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Test
	public void walking() {
		System.out.println(name+"�٭n���h�[!");
	}
	
	
	
}
