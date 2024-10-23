package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	@Test
	public void dogTest() {
		//使用關鍵字 new 建立實例
		Dog myDog = new Dog();
		//設定每個實例不同的屬性(特性)
		myDog.category = "汪汪";
		myDog.color = "淺黃色";
		myDog.name = "霸氣1扛3";
		myDog.age = 2;
		
		System.out.println("狗的品種:"+myDog.category);
		System.out.println("我家的狗毛髮:"+myDog.color);
		//=============
		//使用方法(行為)
		myDog.eat("體重1扛3");
	}
	@Test
	public void bankTest(){
		Bank bank = new Bank();
		bank.setUser("AAA");
		bank.setBalance(1000);
//		mybank.branch = "TTA分行";
//		mybank.user = "AAA";
// 		mybank.balance = 1000;
		
		
		//存款
//		bank.saving(500);
		bank.withdraw(2000);
		
		
	}
	
	@Test
	public void stringTest() {
		String str = "ABC";
		String str1 = "ABC";
		String str2 = new String ("ABC");
		String str3 = str2;
		//==的作用1比較基本資料型態的值
	    //      2比較類別的記憶體位置
		
	}
	@Test
	/**
	 * 參數可以使用類別 會傳入記憶體位置 可以使用該類別的屬性及方法
	 * 
	 * @param bank
	 */
	public void stringTest(Bank bank) {
		 bank.saving(500);
	}
	public void stringTest(String branch,String user) {
		//也可以直接帶入類別內的屬性 就不用從記憶體位置內取出屬性
	}
	public Bank withdraw2(String branch) {
		return new Bank();
	}//回傳的資料型態可以是類別 不過要new才可回傳
	public void stringTest3(int branch,String ...user) {
		//可變參數 會將該參數轉換為陣列  不過只能放在()最右邊 而且只能有一個
		System.out.println();
		System.out.println();
		System.out.println();
		return;
	}
	public void bankTest2() {
		Bank bank = new Bank();
		bank.setBalance(1000);
		bank.setUser("AAA");
		bank.setBranch("TTA");
//===============================
		Bank bank1 = new Bank("TTB","BBB",2000);
		
	}
	@Test
	public void stringTest() {
		//withdraw31是靜態方法,可以直接透過類別名稱.靜態方法呼叫
		//withdraw3是一般方法，必須要先NEW出來後才可呼叫
	}
	@Test
	public void stringTest3() {
		String str ="ABCADAQW";
		String newStr = str.replace("A","Z");
		String newStr1 = str.replaceAll("A", "Z");
		System.out.println(newStr);
		System.out.println(newStr1);
		
		String newStr2 = str.replaceAll("[A-C]", "Z");
		System.out.println(newStr2);
		
		String newStr3 = str.replace("[A-C]", "Z");
		System.out.println(newStr3);
		}
	@Test
	public void interfaceTest() {
		MyInterface my = new MyInterfaceImpl();
		System.out.println(my.NUM);
		System.out.println(MyInterface.NUM);
	}
}
