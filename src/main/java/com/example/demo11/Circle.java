package com.example.demo11;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("繪製圖形");
	}
	
	//被繼承的Shape類別中，因為有定義抽象方法draw1，所以這個方法必須被重新定義
	@Override
	public void draw1() {
		System.out.println("繪製圖形,一圈又一圈");
	}
	
}
