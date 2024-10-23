package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LEC6Test {
	@Test
	public void LecTest() {
		int a = 10;
		Integer b = 20;
		Integer c = new Integer(30);//class的預設值為null
        //class 類別
		String str = "abc";
		String str1 = new String();
        //class才可以使用new，new是給一個記憶體空間去存放類別
		int aaa;//預設值是0
		Integer bbb;//預設值為null 因為Integer為class
	}
	
	@Test
	public void stringTest() {
		String str="abc";
		str=str+"ABC";
		
		System.out.println(str);
		System.out.println(str.equals(str2));
		//字串在宣告時是把字串放在字串池 更改及增刪會放在不同記憶體位置
		//StringBuffer 更改及增刪會放在同一個記憶體位置
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer strBuf =new StringBuffer("abc");
		strBuf.append("ABC");
		strBuf.append("DEF").append(false);
		System.out.println(strBuf);
	}
	@Test
	public void stringReverseTest() {
		String str = "abcde";
		String[]strArray = str.split("");
		String newStr="";
		
		for(int i=strArray.length-1;i>=0;i--) {
			String item = strArray[i];//不先改變資料型態的話無法直接+字串
			newStr=newStr+item;
			//第一次:i=4;item = "e";newStr 從""-->""+"e"="e"
			//第一次:i=3;item = "d";
			//第一次:i=2;item = "c";
			//第一次:i=1;item = "b";
			//第一次:i=0;item = "a";
		}
		System.out.println(newStr);
		//===============
	    StringBuffer strBuf = new StringBuffer(str);
	    strBuf = strBuf.reverse();
	}
	
	@Test
	public void tttTest() {
		int a=5;
		if(a>=18) //不加大括號if默認內容只為下一行
			System.out.println("年齡:"+a);
			System.err.println("已成年");
		
	}

}
