package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.springframework.util.StringUtils;

public class Lec5Test {

	@Test
	public void mathTest(){
		int a = Math.max(99, 2);
		System.out.println(a);
		int b = Math.min(99, 2);
		System.out.println(b);
		int c = Math.max(1,Math.max(2, 99));
		System.out.println(c);
		
		int d = Math.abs(-1);
		System.out.println(d);
		int e1 =(int) Math.round(3.4);
		System.out.println(e1);
		int f1 =(int) Math.rint(2.5);
		System.out.println(f1);
		int g1 = (int)Math.ceil(2.5);
		int g2 = (int)Math.floor(3.5);
		System.out.println(g1+" "+g2);
		int h1 = (int)Math.sqrt(4);
		int h2 = (int)Math.cbrt(27);
		System.out.println(h1+" "+h2);
	}
	@Test
	public void stringTest() {
		//長度
		String str1 = "123456";
		int a = str1.length();
		System.out.println(a);
		
		//判斷內容有無意義
		String str2="";
		String str3="";
		boolean b1 =str2.isEmpty();
		boolean b2 =str3.isEmpty();
		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n",str2.length(),b1);
		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n",str3.length(),b2);
		boolean b3 =str2.isBlank();
		boolean b4 =str3.isBlank();
		System.out.printf("字串長度為:%d, isBlank的結果為:%b\n",str2.length(),b3);
		System.out.printf("字串長度為:%d, isBlank的結果為:%b\n",str3.length(),b4);
		boolean b5 = StringUtils.hasLength(str2);
		
		String s1 = "小龍女與楊過";
		String s2 = "過楊與女龍小";
		System.out.println(s1.contains("不"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf("楊"));
		System.out.println(s1.lastIndexOf("楊"));
		
		System.out.println(s1.substring(2));//從2開始return
		System.out.println(s1.substring(2, 4));//從2-3開始return
		System.out.println(s1.replace("與",""));//當以空字串取代某個文字時,極可能刪除某個文字
	    System.out.println(s1.concat(s2));
	    
	    String[] ar1 = s1.split("與");//以值做為切斷劃分的多個字串片段
	    String[] ar2 = s1.split(" ");//每個字之間都做切割
	    System.out.println(Arrays.toString(ar1));
	    System.out.println(String.join("+", ar2));
	}
	@Test
	public void practice2() {
		String abcd="AABBCBDCDACBDA";
		int length1;
		int length2;
		String[]test= {"A","B","C","D"};
		for(int i=0;i<=abcd.length();i++) {
			length1=abcd.length();
			abcd = abcd.replace(test[i],"");
			length2=abcd.length();
			System.out.println();
			System.out.printf("%d個%S",(length1-length2),test[i]);
		}
		
	}		
	@Test	
	public void practice3() {
		
		String abcd="AABBCBDCDACBDAC";
		String[] ar1 = abcd.split("A");
		String[] ar2 = abcd.split("B");
		String[] ar3 = abcd.split("C");
		String[] ar4 = abcd.split("D");
		System.out.println(Arrays.toString(ar1));
		int a = abcd.length()-1;
		System.out.println(abcd.length());
		System.out.println(abcd.charAt(a));
		int length1=ar1.length-1;
		int length2=ar2.length-1;
		int length3=ar3.length-1;
		int length4=ar4.length-1;
		switch(abcd.charAt(a)) {
		   case 'A':
			   length1+=1;
			   break;
		   case 'B':
			   length2+=1;
			   break;
		   case 'C':
			   length3+=1;
			   break;
	       case 'D':
	    	   length4+=1;
	    	   break;
	       default:
	    	   break;
	    
		}
		
		System.out.printf("%d個A",length1);
		System.out.println();
		System.out.printf("%d個B",length2);
		System.out.println();
		System.out.printf("%d個C",length3);
		System.out.println();
        System.out.printf("%d個D",length4);
		
	}
	
}
