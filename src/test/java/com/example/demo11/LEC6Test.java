package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LEC6Test {
	@Test
	public void LecTest() {
		int a = 10;
		Integer b = 20;
		Integer c = new Integer(30);//class���w�]�Ȭ�null
        //class ���O
		String str = "abc";
		String str1 = new String();
        //class�~�i�H�ϥ�new�Anew�O���@�ӰO����Ŷ��h�s�����O
		int aaa;//�w�]�ȬO0
		Integer bbb;//�w�]�Ȭ�null �]��Integer��class
	}
	
	@Test
	public void stringTest() {
		String str="abc";
		str=str+"ABC";
		
		System.out.println(str);
		System.out.println(str.equals(str2));
		//�r��b�ŧi�ɬO��r���b�r��� ���μW�R�|��b���P�O�����m
		//StringBuffer ���μW�R�|��b�P�@�ӰO�����m
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
			String item = strArray[i];//�������ܸ�ƫ��A���ܵL�k����+�r��
			newStr=newStr+item;
			//�Ĥ@��:i=4;item = "e";newStr �q""-->""+"e"="e"
			//�Ĥ@��:i=3;item = "d";
			//�Ĥ@��:i=2;item = "c";
			//�Ĥ@��:i=1;item = "b";
			//�Ĥ@��:i=0;item = "a";
		}
		System.out.println(newStr);
		//===============
	    StringBuffer strBuf = new StringBuffer(str);
	    strBuf = strBuf.reverse();
	}
	
	@Test
	public void tttTest() {
		int a=5;
		if(a>=18) //���[�j�A��if�q�{���e�u���U�@��
			System.out.println("�~��:"+a);
			System.err.println("�w���~");
		
	}

}
