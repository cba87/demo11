package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Bird extends Animal{
//使用extend 來繼承Animal中的屬性及方法
//1.屬性name 以及存取私有屬性的getter/setter 方法
//2.eat,sleep 方法
//以上的屬性及方法在Animal 都有 ，不需要再撰寫一次 	
	//建構方法
	//預設建構方法(沒有參數的建構方法)
	public Bird() {
		//在呼叫子類別的建構方法之前，會先呼叫父類別的建構方法
		//不管是預設建構方法還是帶有參數的建構方法
		//即使拿掉呼叫父類別的super()方法，程式還是會先呼叫父類別的建構方法
		super();
		System.out.println("這是子類別");
	}
	

	//bird的name和age繼承自父類別的Anamal，所以帶有name和age的建構方法會去呼叫父類別的建構方法
	public Bird(String string, int i) {
		super(string, i);
		// TODO Auto-generated constructor stub
	}
	//可透過關鍵字super 來使用定義在父類別中public方法
	//屬性Name的權限是private，只能在Animal類別中使用
	public void flying() {
		System.out.println(super.getName()+"要飛多久!");
		System.out.println(getName()+"要飛多久!");
		//目前Java的版本可以將關鍵字super省略
	}
	public void flying2() {
		//因為屬性 age 權限是protected，所以子類別可以直接存取該屬性		
		System.out.println("今年"+age+"歲"+getName()+"要飛多久!");

	}
	//1.子類別可以重新定義(不同實作內容)父類別的方法
	//2.@Override 就是用來標記子類別重新定義父類別的方法:目前的Java版本，此注釋可以省略，建議加
	//2.1@是Annotation,注釋:會在程式碼中提供訊息，這些訊息會在編譯或是執行時被處理
	//3子類別重新定義的方法:
	//  3.1權限不可比父類別小
	//  3.2回傳的資料型態要一樣
	//  3.3方法名稱和小括號中的參數個數要一樣
	//  3.4唯一的不同就是大括號中的實作內容
	@Override
	public void eat() {
		System.out.println(getName()+"吃不停");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"睡很多");
	}
	@Test
	public void playball2(){

		HomeTown hometown = new HomeTown("台南","台灣","安南區");
		
		Employee employee = new Employee("1213546","老王",18,"男",hometown);
		
		System.out.println("=====");
		
		System.out.println(employee.toString());
		
		}
	
}